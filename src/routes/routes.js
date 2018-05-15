import DashboardLayout from '../components/Dashboard/Layout/DashboardLayout.vue'
// GeneralViews
import NotFound from '../components/GeneralViews/NotFoundPage.vue'

// Admin pages
import Overview from 'src/components/Dashboard/Views/InputBobot.vue'
import UserProfile from 'src/components/Dashboard/Views/InputKandidat.vue'
// import Notifications from 'src/components/Dashboard/Views/Notifications.vue'
// import Icons from 'src/components/Dashboard/Views/Icons.vue'
// import Maps from 'src/components/Dashboard/Views/Maps.vue'
// import Typography from 'src/components/Dashboard/Views/Typography.vue'
import HasilHitung from 'src/components/Dashboard/Views/HasilHitung.vue'
// import Dropdown from 'src/components/UIComponents/Dropdown.vue'

const routes = [
  {
    path: '/',
    component: DashboardLayout,
    redirect: '/admin/input-bobot'
  },
  {
    path: '/admin',
    component: DashboardLayout,
    redirect: '/admin/input-bobot',
    children: [
      {
        path: 'input-bobot',
        name: 'Atur Bobot',
        component: Overview
      },
      {
        path: 'input-kandidat',
        name: 'Input Nilai Variabel Setiap HP',
        component: UserProfile
      },
      {
        path: 'hasil-hitung',
        name: 'Hasil Hitung',
        component: HasilHitung
      }
    ]
  },
  { path: '*', component: NotFound }
]

/**
 * Asynchronously load view (Webpack Lazy loading compatible)
 * The specified component must be inside the Views folder
 * @param  {string} name  the filename (basename) of the view to load.
function view(name) {
   var res= require('../components/Dashboard/Views/' + name + '.vue');
   return res;
};**/

export default routes
