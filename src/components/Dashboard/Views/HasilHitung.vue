<template>
   <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Hasil Translate Nilai Kandidat</h4><br>
                                <!-- <p class="category">Here is a subtitle for this table</p> -->
                            </div>
                            <div class="content table-responsive table-full-width">
                                <table class="table table-striped">
                                    <thead>
                                      <!-- <th>Variabel</th>
                                    	<th>Kandidat 1</th>
                                    	<th>Kandidat 2</th>
                                    	<th>Kandidat 3</th>
                                    	<th>Kandidat 4</th>
                                      <th>Kandidat 5</th>
                                      <th>Kandidat 6</th> -->
                                      <th>Nama Kandidat</th>
                                    	<th>RAM</th>
                                    	<th>Processor</th>
                                    	<th>Battery</th>
                                    	<th>Price</th>
                                      <th>Intern Memory</th>
                                      <th>Screen</th>
                                      <th>Rear Camera</th>
                                      <th>Brand</th>
                                    </thead>
                                    <tbody>
                                      <tr v-for="item in items" :key="item.id">
                                        <td>{{ item.namaKandidat }}</td>
                                        <td>{{ item.nilaiRam }}</td>
                                        <td>{{ item.nilaiPro }}</td>
                                        <td>{{ item.nilaiBattery }}</td>
                                        <td>{{ item.nilaiPrice }}</td>
                                        <td>{{ item.nilaiIntMemory }}</td>
                                        <td>{{ item.nilaiScreen }}</td>
                                        <td>{{ item.nilaiRearCamera }}</td>
                                        <td>{{ item.nilaiBrand }}</td>
                                      </tr>
                                        <!-- <tr>
                                        	<td>RAM</td>
                                        	<td>Dakota Rice</td>
                                        	<td>$36,738</td>
                                        	<td>Niger</td>
                                        	<td>Oud-Ta</td>
                                          <td>lalal</td>
                                          <td>lilili</td>
                                        </tr>
                                        <tr>
                                        	<td>Processor</td>
                                        	<td>Minerva Hooper</td>
                                        	<td>$23,789</td>
                                        	<td>Curaçao</td>
                                        	<td>Sinaai-Waas</td>
                                          <td>lalal</td>
                                          <td>lilili</td>
                                        </tr>
                                        <tr>
                                        	<td>Bettery</td>
                                        	<td>Sage Rodriguez</td>
                                        	<td>$56,142</td>
                                        	<td>Netherlands</td>
                                        	<td>Baileux</td>
                                          <td>lalal</td>
                                          <td>lilili</td>
                                        </tr>
                                        <tr>
                                        	<td>Price</td>
                                        	<td>Philip Chaney</td>
                                        	<td>$38,735</td>
                                        	<td>Korea, South</td>
                                        	<td>Overland Park</td>
                                          <td>lalal</td>
                                          <td>lilili</td>
                                        </tr>
                                        <tr>
                                        	<td>Internal Memory</td>
                                        	<td>Doris Greene</td>
                                        	<td>$63,542</td>
                                        	<td>Malawi</td>
                                        	<td>Feldkirchen</td>
                                          <td>lalal</td>
                                          <td>lilili</td>
                                        </tr>
                                        <tr>
                                        	<td>Screen</td>
                                        	<td>Mason Porter</td>
                                        	<td>$78,615</td>
                                        	<td>Chile</td>
                                        	<td>Gloucester</td>
                                          <td>lalal</td>
                                          <td>lilili</td>
                                        </tr>
                                         <tr>
                                        	<td>Rear Camera</td>
                                        	<td>Mason Porter</td>
                                        	<td>$78,615</td>
                                        	<td>Chile</td>
                                        	<td>Gloucester</td>
                                          <td>lalal</td>
                                          <td>lilili</td>
                                        </tr>
                                         <tr>
                                        	<td>Brand</td>
                                        	<td>Mason Porter</td>
                                        	<td>$78,615</td>
                                        	<td>Chile</td>
                                        	<td>Gloucester</td>
                                          <td>lalal</td>
                                          <td>lilili</td>
                                        </tr> -->
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Hasil Matriks</h4><br>
                                <!-- <p class="category">Here is a subtitle for this table</p> -->
                            </div>
                            <div class="content table-responsive table-full-width">
                                <table class="table table-striped">
                                    <thead>
                                      <th>Nama Kandidat</th>
                                    	<th>RAM</th>
                                    	<th>Processor</th>
                                    	<th>Battery</th>
                                    	<th>Price</th>
                                      <th>Intern Memory</th>
                                      <th>Screen</th>
                                      <th>Rear Camera</th>
                                      <th>Brand</th>
                                    </thead>
                                    <tbody>
                                      <tr v-for="matrik in matriks" :key="matrik.id">
                                        <td>{{ matrik.namaKandidat }}</td>
                                        <td>{{ matrik.nilaiRam }}</td>
                                        <td>{{ matrik.nilaiPro }}</td>
                                        <td>{{ matrik.nilaiBattery }}</td>
                                        <td>{{ matrik.nilaiPrice }}</td>
                                        <td>{{ matrik.nilaiIntMemory }}</td>
                                        <td>{{ matrik.nilaiScreen }}</td>
                                        <td>{{ matrik.nilaiRearCamera }}</td>
                                        <td>{{ matrik.nilaiBrand }}</td>
                                      </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Hasil SAW</h4><br>
                                <!-- <p class="category">Here is a subtitle for this table</p> -->
                            </div>
                            <div class="content table-responsive table-full-width">
                                <table class="table table-striped">
                                    <thead>
                                      <th>Nama Kandidat</th>
                                    	<th>Hasil SAW</th>
                                    </thead>
                                    <tbody>
                                      <tr v-for="saw in saws" :key="saw.id">
                                        <td>{{ saw.namaKandidat }}</td>
                                        <td>{{ saw.hasilSaw }}</td>
                                      </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Kesimpulan</h4><br>
                                <!-- <p class="category">Here is a subtitle for this table</p> -->
                            </div>
                            <div class="container">
                                <p>Jadi, berdasarkan hasil perhitungan SAW yang telah dilakukan, HP yang paling direkomendasikan
                                  adalah HP : {{ maxSaw.namaKandidat }}
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
   </div>
</template>
<script>
  import StatsCard from 'components/UIComponents/Cards/StatsCard.vue'
  import axios from 'axios'

  export default {
    components: {
      StatsCard
      // ChartCard
    },
    /**
     * Chart data used to render stats, charts. Should be replaced with server data
     */
    data () {
      return {
        fields: {
          id: {
            label: 'ID',
            sortable: true
          },
          nilaiRam: {
            label: 'RAM',
            sortable: true
          },
          nilaiPro: {
            label: 'Processor',
            sortable: true
          },
          nilaiBattery: {
            label: 'Battery',
            sortable: true
          }
        },
        items: [],
        matriks: [],
        saws: [],
        maxSaw: [],
        idMax: ''
      }
    },
    mounted: function () {
      this.getHasil()
      this.getMatriks()
      // this.hitungSaw2()
      this.hitungSaw()
      this.getIdMax()
    },
    methods: {
      getHasil: function () {
        const URL = '/api/hasil'
        axios.get(URL)
          .then(res => {
            this.items = res.data
          })
          .catch(err => {
            alert(err)
          })
      },
      getMax: function () {
        // alert(this.idMax)
        const URL = '/api/get-max/' + this.idMax
        axios.get(URL)
          .then(res => {
            this.maxSaw = res.data
          })
          .catch(err => {
            alert(err)
          })
      },
      getMatriks: function () {
        const URL = '/api/get-matriks'
        axios.get(URL)
          .then(res => {
            this.matriks = res.data
          })
          .catch(err => {
            alert(err)
          })
      },
      hitungSaw: function () {
        const URL = '/api/hitung-saw'
        axios.get(URL)
          .then(res => {
            this.saws = res.data
          })
          .catch(err => {
            alert(err)
          })
      },
      hitungSaw2: function () {
        const URL = '/api/hitung-saw2/0'
        axios.put(URL)
          .then(res => {
            this.saws = res.data
          })
          .catch(err => {
            alert(err)
          })
      },
      getIdMax: function () {
        const URL = '/api/get-id'
        axios.get(URL)
          .then(res => {
            this.idMax = res.data
            alert(this.idMax)
            this.getMax()
          })
          .catch(err => {
            alert(err)
          })
      },
      isiBobot: function () {
        const URL = '/api/step1/0'
        axios.put(URL, {
          'bobotRam': this.items.bobotRam,
          'bobotPro': this.items.bobotPro,
          'bobotInternalMemory': this.items.bobotInternalMemory,
          'bobotScreen': this.items.bobotScreen,
          'bobotPrice': this.items.bobotPrice,
          'bobotBattery': this.items.bobotBattery,
          'bobotBrand': this.items.bobotBattery,
          'bobotRearCamera': this.items.bobotRearCamera
        })
          .then(res => {
            window.location.href = '/#/admin/input-kandidat'
            alert('Isi bobot berhasil')
          })
          .catch(err => {
            alert(err)
          })
      }
    }
  }

</script>
<style>

</style>
