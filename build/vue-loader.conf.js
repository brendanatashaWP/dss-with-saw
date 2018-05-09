var utils = require('./utils')
var config = require('../config')
var isProduction = process.env.NODE_ENV === 'production'

module.exports = {
  // ram = 19.5,
  // processor = 17.5,
  // battery = 15.5,
  // price = 13.5,
  // internalMemory = 11.5,
  // screen = 9.5,
  // rearCam = 7.5,
  // brand = 5.5,
  loaders: utils.cssLoaders({
    sourceMap: isProduction
      ? config.build.productionSourceMap
      : config.dev.cssSourceMap,
    extract: isProduction
  }),
  postcss: [
    require('autoprefixer')({
      browsers: ['last 2 versions']
    })
  ]
}
