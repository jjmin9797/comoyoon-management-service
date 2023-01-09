<template>
<ComoHeader/>
<ItemHeader :headerName="headerName"/>
<DetailContent/>
<ComoFooter/>
</template>

<script>
import ComoHeader from "@/components/client/basic/como-header.vue";
import ComoFooter from "@/components/client/basic/como-footer.vue";
import ItemHeader from '@/components/client/basic/como-item-header.vue';
import DetailContent from "@/components/client/promotion/promotion-detail-content.vue";
export default {
  components: {
    ComoHeader,
    ComoFooter,
    ItemHeader,
    DetailContent,
  },
  setup() {
    const headerName = "Promotion / Detail";
    return {
        headerName,
        
    }
  }
};
</script>

<style>
</style>