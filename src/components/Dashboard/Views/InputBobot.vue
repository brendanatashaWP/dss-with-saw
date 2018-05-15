<template>
  <div>

    <!--Stats cards-->
    <div class="row">
      <div class="col-lg-3 col-sm-6">
        <stats-card>
          <div class="icon-big text-center" :class="`icon-success`" slot="header">
            <i :class="'ti-layout-sidebar-2'"></i>
          </div>
          <div class="numbers" slot="content">
            <p>RAM</p>
            <!-- {{stats.footerText}} -->
          </div>
          <div class="stats" slot="footer">
            <fg-input type="number"
                      label="Isi Bobot disini"
                      :placeholder="'RAM'"
                      v-model.number="items.bobotRam">
            </fg-input>
            <!-- <i :class="stats.footerIcon"></i> {{stats.footerText}} -->
          </div>
        </stats-card>
      </div>
      <div class="col-lg-3 col-sm-6">
        <stats-card>
          <div class="icon-big text-center" :class="`icon-success`" slot="header">
            <i :class="'ti-layout-grid3'"></i>
          </div>
          <div class="numbers" slot="content">
            <p>Processor</p>
            <!-- {{stats.footerText}} -->
          </div>
          <div class="stats" slot="footer">
            <fg-input type="number"
                      label="Isi Bobot disini"
                      :placeholder="'Processor'"
                      v-model.number="items.bobotPro">
            </fg-input>
            <!-- <i :class="stats.footerIcon"></i> {{stats.footerText}} -->
          </div>
        </stats-card>
      </div>
      <div class="col-lg-3 col-sm-6">
        <stats-card>
          <div class="icon-big text-center" :class="`icon-danger`" slot="header">
            <i :class="'ti-bolt'"></i>
          </div>
          <div class="numbers" slot="content">
            <p>Battery</p>
            <!-- {{stats.footerText}} -->
          </div>
          <div class="stats" slot="footer">
            <fg-input type="number"
                      label="Isi Bobot disini"
                      :placeholder="'Battery'"
                      v-model.number="items.bobotBattery">
            </fg-input>
            <!-- <i :class="stats.footerIcon"></i> {{stats.footerText}} -->
          </div>
        </stats-card>
      </div>
      <div class="col-lg-3 col-sm-6">
        <stats-card>
          <div class="icon-big text-center" :class="`icon-info`" slot="header">
            <i :class="'ti-money'"></i>
          </div>
          <div class="numbers" slot="content">
            <p>Price</p>
            <!-- {{stats.footerText}} -->
          </div>
          <div class="stats" slot="footer">
            <fg-input type="number"
                      label="Isi Bobot disini"
                      :placeholder="'Price'"
                      v-model.number="items.bobotPrice">
            </fg-input>
            <!-- <i :class="stats.footerIcon"></i> {{stats.footerText}} -->
          </div>
        </stats-card>
      </div>
      <div class="col-lg-3 col-sm-6">
        <stats-card>
          <div class="icon-big text-center" :class="`icon-info`" slot="header">
            <i :class="'ti-server'"></i>
          </div>
          <div class="numbers" slot="content">
            <p>Internal Memory</p>
            <!-- {{stats.footerText}} -->
          </div>
          <div class="stats" slot="footer">
            <fg-input type="number"
                      label="Isi Bobot disini"
                      :placeholder="'Internal Memory'"
                      v-model.number="items.bobotInternalMemory">
            </fg-input>
            <!-- <i :class="stats.footerIcon"></i> {{stats.footerText}} -->
          </div>
        </stats-card>
      </div>
      <div class="col-lg-3 col-sm-6">
        <stats-card>
          <div class="icon-big text-center" :class="`icon-success`" slot="header">
            <i :class="'ti-ruler-alt'"></i>
          </div>
          <div class="numbers" slot="content">
            <p>Screen</p>
            <!-- {{stats.footerText}} -->
          </div>
          <div class="stats" slot="footer">
            <fg-input type="number"
                      label="Isi Bobot disini"
                      :placeholder="'Screen'"
                      v-model.number="items.bobotScreen">
            </fg-input>
            <!-- <i :class="stats.footerIcon"></i> {{stats.footerText}} -->
          </div>
        </stats-card>
      </div>
      <div class="col-lg-3 col-sm-6">
        <stats-card>
          <div class="icon-big text-center" :class="`icon-info`" slot="header">
            <i :class="'ti-camera'"></i>
          </div>
          <div class="numbers" slot="content">
            <p>Rear Camera</p>
            <!-- {{stats.footerText}} -->
          </div>
          <div class="stats" slot="footer">
            <fg-input type="number"
                      label="Isi Bobot disini"
                      :placeholder="'Rear Camera'"
                      v-model.number="items.bobotRearCamera">
            </fg-input>
            <!-- <i :class="stats.footerIcon"></i> {{stats.footerText}} -->
          </div>
        </stats-card>
      </div>
      <div class="col-lg-3 col-sm-6">
        <stats-card>
          <div class="icon-big text-center" :class="`icon-danger`" slot="header">
            <i :class="'ti-heart'"></i>
          </div>
          <div class="numbers" slot="content">
            <p>Brand</p>
            <!-- {{stats.footerText}} -->
          </div>
          <div class="stats" slot="footer">
            <fg-input type="number"
                      label="Isi Bobot disini"
                      :placeholder="'Brand'"
                      v-model.number="items.bobotBrand"
                      @change="updateTotalBobot">
            </fg-input>
            <!-- <i :class="stats.footerIcon"></i> {{stats.footerText}} -->
          </div>
        </stats-card>
      </div>
      <!-- btas -->
      <div class="text-right">
        <h4 @load="hitungBobot">Total bobot saat ini : {{ totalBobot }}</h4>
        <button type="submit" class="btn btn-info btn-fill" @click="isiBobot"><a href="/#/admin/input-kandidat" style="color:white" class="ti-arrow-right"> Next</a></button>
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
        items: [],
        totalBobot: 0
      }
    },
    computed: {
      hitungBobot: function () {
        this.totalBobot = 0
        this.totalBobot = this.items.bobotRam + this.items.bobotPro +
        this.items.bobotBattery + this.items.bobotInternalMemory + this.items.bobotScreen +
        this.items.bobotRearCamera + this.items.bobotBrand + this.items.bobotPrice
        // if (this.totalBobot > 100) {
        //   alert('Sudah 100!')
        // }
        return this.totalBobot
      }
    },
    mounted: function () {
      this.getBobot()
    },
    methods: {
      getBobot: function () {
        const URL = '/api/step1/0'
        axios.get(URL)
          .then(res => {
            this.items = res.data
            // this.totalBobot = this.items.bobotRam + this.items.bobotPro
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
          'bobotBrand': this.items.bobotBrand,
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
