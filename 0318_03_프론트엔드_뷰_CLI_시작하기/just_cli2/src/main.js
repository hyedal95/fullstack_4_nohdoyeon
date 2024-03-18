import Vue from 'vue'
import WrapComponent from './components/WrapComponent.vue';



Vue.config.productionTip = false

new Vue({
  render: h => h(WrapComponent),
}).$mount('#root')
