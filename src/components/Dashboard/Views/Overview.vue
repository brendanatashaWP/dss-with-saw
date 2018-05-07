<template>
  <div>

    <!--Stats cards-->
    <div class="row">
      <div class="col-lg-3 col-sm-6" v-for="stats in statsCards">
        <stats-card>
          <div class="icon-big text-center" :class="`icon-${stats.type}`" slot="header">
            <i :class="stats.icon"></i>
          </div>
          <div class="numbers" slot="content">
            <p>{{stats.title}}</p>
            {{stats.footerText}}
          </div>
          <div class="stats" slot="footer">
            <fg-input type="email"
                      label="Isi Bobot disini"
                      :placeholder="stats.title"
                      v-model="stats.footerText">
            </fg-input>
            <!-- <i :class="stats.footerIcon"></i> {{stats.footerText}} -->
          </div>
        </stats-card>
      </div>
      <div class="text-right">
        <button type="submit" class="btn btn-info btn-fill" @click="goNext()"><a href="http://localhost:8080/#/admin/stats" style="color:white" class="ti-arrow-right"> Next</a></button>
      </div>
    </div>

    <!--Charts-->
    <!-- <div class="row">

      <div class="col-xs-12">
        <chart-card :chart-data="usersChart.data" :chart-options="usersChart.options">
          <h4 class="title" slot="title">Users behavior</h4>
          <span slot="subTitle"> 24 Hours performance</span>
          <span slot="footer">
            <i class="ti-reload"></i> Updated 3 minutes ago</span>
          <div slot="legend">
            <i class="fa fa-circle text-info"></i> Open
            <i class="fa fa-circle text-danger"></i> Click
            <i class="fa fa-circle text-warning"></i> Click Second Time
          </div>
        </chart-card>
      </div>

      <div class="col-md-6 col-xs-12">
        <chart-card :chart-data="preferencesChart.data"  chart-type="Pie">
          <h4 class="title" slot="title">Email Statistics</h4>
          <span slot="subTitle"> Last campaign performance</span>
          <span slot="footer">
            <i class="ti-timer"></i> Campaign set 2 days ago</span>
          <div slot="legend">
            <i class="fa fa-circle text-info"></i> Open
            <i class="fa fa-circle text-danger"></i> Bounce
            <i class="fa fa-circle text-warning"></i> Unsubscribe
          </div>
        </chart-card>
      </div> -->

      <!-- <div class="col-md-6 col-xs-12">
        <chart-card :chart-data="activityChart.data" :chart-options="activityChart.options">
          <h4 class="title" slot="title">2015 Sales</h4>
          <span slot="subTitle"> All products including Taxes</span>
          <span slot="footer">
            <i class="ti-check"></i> Data information certified</span>
          <div slot="legend">
            <i class="fa fa-circle text-info"></i> Tesla Model S
            <i class="fa fa-circle text-warning"></i> BMW 5 Series
          </div>
        </chart-card>
      </div> -->

    <!-- </div> -->

  </div>
</template>
<script>
  import StatsCard from 'components/UIComponents/Cards/StatsCard.vue'
  // import ChartCard from 'components/UIComponents/Cards/ChartCard.vue'
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
        statsCards: [
          {
            type: 'success',
            icon: 'ti-layout-sidebar-2',
            title: 'RAM',
            value: '105GB',
            footerText: '',
            footerIcon: 'ti-reload'
          },
          {
            type: 'success',
            icon: 'ti-layout-grid3',
            title: 'Processor',
            value: '$1,345',
            footerText: '',
            footerIcon: 'ti-calendar'
          },
          {
            type: 'danger',
            icon: 'ti-bolt',
            title: 'Battery',
            value: '23',
            footerText: '',
            footerIcon: 'ti-timer'
          },
          {
            type: 'info',
            icon: 'ti-money',
            title: 'Price',
            value: '+45',
            footerText: '',
            footerIcon: 'ti-reload'
          },
          {
            type: 'info',
            icon: 'ti-server',
            title: 'Internal Memory',
            value: '+45',
            footerText: '',
            footerIcon: 'ti-reload'
          },
          {
            type: 'info',
            icon: 'ti-ruler-alt',
            title: 'Screen',
            value: '+45',
            footerText: '',
            footerIcon: 'ti-reload'
          },
          {
            type: 'info',
            icon: 'ti-camera',
            title: 'Rear Camera',
            value: '+45',
            footerText: '',
            footerIcon: 'ti-reload'
          },
          {
            type: 'info',
            icon: 'ti-heart',
            title: 'Brand',
            value: '+45',
            footerText: '',
            footerIcon: 'ti-reload'
          }
        ]
      }
    },
    goNext () {
    }
  }

</script>
<style>

</style>
