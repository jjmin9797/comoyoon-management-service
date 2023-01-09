<template>
<ComoHeader/>
<!-- Main wrapper
        ==================================================================== -->
        <div id="main-wrapper">
            <!-- Main container -->
            <div id="main-container">

                <!-- Back to top button
                ============================================================ -->
                <a href="#" id="back-to-top" class="back-to-top" title="Back to top"></a>


                


                <!-- Page body
                ============================================================ -->
                <div id="page-body" class="page-body">
                    <!-- row -->
                    <div class="row main-row justify-content-center">


                        <!-- Content area
                        ==================================================== -->
                        <div id="primary" class="content-area col-lg-12">
                            <!-- Main -->
                            <main id="main" class="content-area-container site-main">


                                <!-- Section -->
                                <div class="main-section pt-0 pb-0 dark-1-color-bg" style="background-image: url(assets/images/comoyoon/main/main-logo-2.jpg);">

                                    <!-- Media (Background) -->
                                    <div class="section-media section-media-bg">
                                        <!-- Slider block -->
                                        <div
                                            class="owl-slider owl-carousel"
                                            data-owl-slider-items-xl="1"
                                            data-owl-slider-items-lg="1"
                                            data-owl-slider-items-md="1"
                                            data-owl-slider-items-sm="1"
                                            data-owl-slider-items-xs="1"
                                            data-owl-slider-items-margin="0"
                                            data-owl-slider-loop="yes"
                                            data-owl-slider-autoplay="yes"
                                            data-owl-slider-animateIn="fadeIn"
                                            data-owl-slider-animateOut="fadeOut"
                                            data-owl-slider-mouseDrag="no"
                                            data-owl-slider-touchDrag="no"
                                            data-page-direction="ltr">


                                            <!-- Slider item -->
                                            <div class="owl-slider-item" style="background-image: url(assets/images/comoyoon/main/main-logo-1.jpg);">
                                            </div><!-- /End Slider item -->


                                            <!-- Slider item -->
                                            <div class="owl-slider-item" style="background-image: url(assets/images/comoyoon/main/main-logo-2.jpg);">
                                            </div><!-- /End Slider item -->


                                            <!-- Slider item -->
                                            <div class="owl-slider-item" style="background-image: url(assets/images/comoyoon/main/main-logo-3.jpg);">
                                            </div><!-- /End Slider item -->


                                        </div><!-- /End Slider block -->
                                    </div><!-- /End Media (Background) -->

                                    <!-- container -->
                                    <div class="container gx-4">
                                        <!-- row -->
                                        <div class="row gx-36 height-100vh align-items-center justify-content-center height-100vh pt-72 pb-72">


                                            <!-- col-lg-12 -->
                                            <div class="col-lg-12">


                                                <!-- GAP -->
                                                <div class="gap gap-72 d-none d-xl-block"></div>


                                                <!-- Section title -->
                                                <div class="section-title section-title-intro text-center light-color" data-animation="animate__zoomIn">
                                                    <!-- Section title container -->
                                                    <div class="section-title-container">

                                                        <!-- Section title body -->
                                                        <div class="section-title-body">

                                                            <!-- Section title heading -->
                                                            <div class="section-title-heading">
                                                                <h1 class="font-weight-900">COMO YOON</h1>
                                                                <h3 class="font-weight-900">FLOWER SHOP & DESSERT CAFE</h3>
                                                                <h3 class="font-weight-900">FOR YOUR BEANINGFUL MOMENTS</h3>
                                                            </div><!-- /End Section title heading -->

                                                        </div><!--/End Section title body -->

                                                    </div><!-- /End Section title container -->
                                                </div><!-- /End Section title -->


                                                <!-- Section title -->
                                                <div class="section-title section-title-intro text-center light-color mb-0" data-animation="animate__zoomIn" data-animation-delay="400">
                                                    <!-- Section title container -->
                                                    <div class="section-title-container">

                                                        <!-- Section title body -->
                                                        <div class="section-title-body">

                                                            <!-- Block content -->
                                                            <div class="section-title-content">
                                                                <a href="https://www.instagram.com/comoyoon/" class="btn btn-light btn-round btn-lg btn-outline-reverse">INSTAGRAM</a>
                                                            </div><!-- /End Block content -->

                                                        </div><!--/End Section title body -->

                                                    </div><!-- /End Section title container -->
                                                </div><!-- /End Section title -->


                                            </div><!-- /End col-lg-12 -->


                                        </div><!-- /End row -->
                                    </div><!-- /End container -->

                                </div><!-- /End Section -->

                
                            </main><!-- /End Main -->
                        </div><!-- /End Content area -->


                    </div><!-- /End row -->
                </div><!-- /End Page body -->




            </div><!-- /End Main container -->
        </div><!-- /End Main wrapper -->
        <ComoFooter/>
</template>

<script>
import ComoFooter from "@/components/client/basic/como-footer.vue";
import ComoHeader from "@/components/client/basic/como-header.vue";
export default {
  components: {
    ComoFooter,ComoHeader
  }
}
</script>

<style>

</style>