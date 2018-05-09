import Vue from 'vue'
import DashboardLayout from '../components/Dashboard/Layout/DashboardLayout.vue'
// GeneralViews
import NotFound from '../components/GeneralViews/NotFoundPage.vue'

// Admin pages
import Overview from 'src/components/Dashboard/Views/Overview.vue'
import UserProfile from 'src/components/Dashboard/Views/UserProfile.vue'
import Notifications from 'src/components/Dashboard/Views/Notifications.vue'
import Icons from 'src/components/Dashboard/Views/Icons.vue'
import Maps from 'src/components/Dashboard/Views/Maps.vue'
import Typography from 'src/components/Dashboard/Views/Typography.vue'
import TableList from 'src/components/Dashboard/Views/TableList.vue'
// import Dropdown from 'src/components/UIComponents/Dropdown.vue'
import Router from 'vue-router'
import Auth from '@okta/okta-vue'
Vue.use(Auth, {
  issuer: 'https://dev-171124.oktapreview.com.com/oauth2/default',
  client_id: '0oaexy2ksboKei91L0h7',
  redirect_uri: 'http://localhost:8081/implicit/callback',
  scope: 'openid profile email'
})

Vue.use(Router)
let routes = ''
let router = new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      component: DashboardLayout,
      redirect: '/admin/overview'
    },
    {
      path: '/implicit/callback',
      component: Auth.handleCallback()
    },
    {
      path: '/admin',
      component: DashboardLayout,
      redirect: '/admin/stats',
      children: [
        {
          path: 'overview',
          name: 'Atur Bobot',
          component: Overview
        },
        {
          path: 'stats',
          name: 'Input Nilai Variabel Setiap HP',
          component: UserProfile
        },
        {
          path: 'notifications',
          name: 'notifications',
          component: Notifications
        },
        {
          path: 'icons',
          name: 'icons',
          component: Icons
        },
        {
          path: 'maps',
          name: 'maps',
          component: Maps
        },
        {
          path: 'typography',
          name: 'typography',
          component: Typography
        },
        {
          path: 'table-list',
          name: 'table-list',
          component: TableList
        }
      ]
    },
    { path: '*', component: NotFound }
  ]
})

/**
 * Asynchronously load view (Webpack Lazy loading compatible)
 * The specified component must be inside the Views folder
 * @param  {string} name  the filename (basename) of the view to load.
function view(name) {
   var res= require('../components/Dashboard/Views/' + name + '.vue');
   return res;
};**/

router.beforeEach(Vue.prototype.$auth.authRedirectGuard())
export default routes
