import { createRouter, createWebHistory } from "vue-router";
import AdminLogin from "@/pages/admin/login/admin-login";
import ClientMain from "@/pages/client/client-main";
import AboutUs from "@/pages/client/aboutus/client-aboutus";
import Promotion from "@/pages/client/promotion/client-promotion";
import PromotionDetail from "@/pages/client/promotion/client-promotion-detail";
import Dashboard from '@/pages/admin/dashboard/admin-dashboard';
const router = createRouter({
    history: createWebHistory(),
    mode: 'history',
    routes: [
        {
            path: '/',
            name: 'ClientMain',
            component: ClientMain
        },
        {
            path: '/aboutus',
            name: 'AboutUs',
            component: AboutUs
        },
        {
            path: '/promotion',
            name: 'Promotion',
            component: Promotion
        },
        {
            path: '/promotion/:id',
            name: 'PromotionDetail',
            component: PromotionDetail
        },
        {
            path: '/adminlogin',
            name: 'AdminLogin',
            component: AdminLogin
        },
        {
            path: '/admin/dashboard',
            name: 'Dashboard',
            component: Dashboard
        },

    ]
})
export default router;