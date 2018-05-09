<template>
  <div class="card">
    <div class="header">
      <h4 class="title">Kandidat</h4>
    </div>
    <div class="content">
      <form>
        <div class="row">
          <div class="col-md-5">
            <label for="namaKandidat">Nama kandidat:</label>
            <input type="text" v-model="namaKandidat">
          </div>
        </div>
        <div class="row">
          <div class="col-md-5">
            <label for="ram">RAM </label>
            <select v-model="ramSelected">
              <option disabled value=''>Please select one</option>
              <option>8 GB</option>
              <option>6 GB</option>
              <option>4 GB</option>
              <option>3 GB</option>
              <option>2 GB</option>
            </select>
          </div>
        </div>
        <div class="row">
          <div class="col-md-5">
            <label for="ram">Processor</label>
            <select v-model="processorSelected">
              <option disabled value=''>Please select one</option>
              <option>Snapdragon</option>
              <option>Mediatek</option>
              <option>Intel</option>
            </select>
          </div>
        </div>
        <div class="row">
          <div class="col-md-5">
            <label for="ram">Battery</label>
            <select v-model="batterySelected">
              <option disabled value=''>Please select one</option>
              <option>5001 - 6000</option>
              <option>4001 - 5000</option>
              <option>3001 - 4000</option>
              <option>2000 - 3000</option>
            </select>
          </div>
        </div>
        <div class="row">
          <div class="col-md-5">
            <label for="ram">Price</label>
            <select v-model="priceSelected">
              <option disabled value=''>Please select one</option>
              <option>6jt - 7jt</option>
              <option>4jt - 5jt</option>
              <option>3jt - 4jt</option>
              <option>2jt - 3jt</option>
            </select>
          </div>
        </div>
        <div class="row">
          <div class="col-md-5">
            <label for="ram">Internal Memory</label>
            <select v-model="memorySelected">
              <option disabled value=''>Please select one</option>
              <option>128 Gb</option>
              <option>64 Gb</option>
              <option>32 Gb</option>
              <option>16 Gb</option>
            </select>
          </div>
        </div>
        <div class="row">
          <div class="col-md-5">
            <label for="ram">Screen</label>
            <select v-model="screenSelected">
              <option disabled value=''>Please select one</option>
              <option>6,1 - 6,5</option>
              <option>5,6 - 6</option>
              <option>5,1 - 5,5</option>
              <option>4,5 - 5</option>
            </select>
          </div>
        </div>
        <div class="row">
          <div class="col-md-5">
            <label for="ram">Rear Camera</label>
            <select v-model="rearCameraSelected">
              <option disabled value=''>Please select one</option>
              <option>16</option>
              <option>13</option>
              <option>12</option>
              <option>8</option>
              <option>5</option>
            </select>
          </div>
        </div>
      </form>
    </div>
  </div>
</template>
<script>
  export default {
    data () {
      return {
        id: '',
        namaKandidat: '',
        memorySelected: '',
        priceSelected: '',
        batterySelected: '',
        processorSelected: '',
        ramSelected: '',
        screenSelected: '',
        rearCameraSelected: ''
      }
    },
    methods: {
    }
  }

</script>
<style>

</style>
