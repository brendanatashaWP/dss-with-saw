import Sidebar from './SideBar.vue'

const SidebarStore = {
  showSidebar: false,
  sidebarLinks: [
    {
      name: 'Step 1: Atur Bobot',
      icon: 'ti-panel',
      path: '/admin/input-bobot'
    },
    {
      name: 'Step 2: Input Nilai',
      icon: 'ti-user',
      path: '/admin/input-kandidat'
    },
    {
      name: 'Step 3: Hasilnya',
      icon: 'ti-view-list-alt',
      path: '/admin/hasil-hitung'
    }
    // {
    //   name: 'Step 4: ',
    //   icon: 'ti-text',
    //   path: '/admin/typography'
    // }
    // {
    //   name: 'Icons',
    //   icon: 'ti-pencil-alt2',
    //   path: '/admin/icons'
    // },
    // {
    //   name: 'Maps',
    //   icon: 'ti-map',
    //   path: '/admin/maps'
    // },
    // {
    //   name: 'Notifications',
    //   icon: 'ti-bell',
    //   path: '/admin/notifications'
    // }
  ],
  displaySidebar (value) {
    this.showSidebar = value
  }
}

const SidebarPlugin = {

  install (Vue) {
    Vue.mixin({
      data () {
        return {
          sidebarStore: SidebarStore
        }
      }
    })

    Object.defineProperty(Vue.prototype, '$sidebar', {
      get () {
        return this.$root.sidebarStore
      }
    })
    Vue.component('side-bar', Sidebar)
  }
}

export default SidebarPlugin
