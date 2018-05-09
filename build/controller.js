const _ = require('lodash');
const kriteria = require('./vue-loader.conf');
const Controller = {};

function getMinMax (value) {
    const ramMax = _.maxBy(value, 'ram');
    const proMax = _.maxBy(value, 'processor');
    const batMax = _.maxBy(value, 'battery');
    const priceMin = _.minBy(value, 'price');
    const intMemoryMax = _.maxBy(value, 'internalMemory');
    const screenMax = _.maxBy(value, 'screen');
    const camMax = _.maxBy(value, 'rearCam');
    const brandMax = _.maxBy(value, 'brand');
    return {
        ram: ramMax.ram,
        processor: proMax.processor,
        battery: batMax.battery,
        price: priceMin.price,
        internalMemory: intMemoryMax.internalMemory,
        screen: screenMax.screen,
        rearCam: camMax.rearCam,
        brand: brandMax.brand
    }
}

function normalisasi (matrix, maxmin) {
    matrix.ram = matrix.ram / maxmin.ram;
    matrix.processor = matrix.processor / maxmin.processor;
    matrix.battery = matrix.battery / maxmin.battery;
    matrix.price = maxmin.price / matrix.price;
    matrix.internalMemory = matrix.internalMemory / maxmin.internalMemory;
    matrix.screen = matrix.screen / maxmin.screen;
    matrix.rearCam = matrix.rearCam / maxmin.rearCam;
    matrix.brand = matrix.brand / maxmin.brand;
    return matrix;
}

function hitungPeringkat (nilai) {
    const total = (nilai.ram * kriteria.ram) + (nilai.processor * kriteria.processor) + (nilai.battery * kriteria.battery) +
    (nilai.price * kriteria.price) + (nilai.internalMemory * kriteria.internalMemory) +
    (nilai.screen * kriteria.screen) + (nilai.rearCam * kriteria.rearCam) +
    (nilai.brand * kriteria.brand);
    const result = {
        nama: nilai.nama,
        total: total
    }
    return result;
}

Controller.getRecommendation = (req, res) => {
    const post = req.body;
    const getNilaiBobot = post;
    const getMaxMin = getMinMax(getNilaiBobot);
    const normalisasiNilai = _.map(getNilaiBobot, nilai => normalisasi(nilai, getMaxMin));
    const hitungBobotPeringkat = _.map(normalisasiNilai, nilai => hitungPeringkat(nilai));
    res.json(hitungBobotPeringkat)
};

module.exports = Controller;