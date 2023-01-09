<template>
<ComoHeader/>
<Banner/>
<Content/>
<ComoFooter/>
</template>

<script>
import ComoHeader from '@/components/client/basic/como-header.vue';
import ComoFooter from '@/components/client/basic/como-footer.vue';
import Banner from '@/components/client/aboutus/aboutus-banner.vue';
import Content from '@/components/client/aboutus/aboutus-content.vue';
export default {
    components: {
        ComoHeader,ComoFooter,Banner,Content
    }
}
</script>

<style>

</style>