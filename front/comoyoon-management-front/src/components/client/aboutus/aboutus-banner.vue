<template>
  <!-- Title -->
  <!-- Breadcrumb section
                ============================================================ -->
  <div
    class="
      breadcrumb-section breadcrumb-section-layout-2
      text-center
      dark-1-color-bg dark-1-color-border
      light-color
    "
  >
    <!-- Media (Background) -->
    <div
      class="section-media section-media-bg"
      style="background-image: url(assets/images/elements/016.jpg)"
    >
      <div class="main-block-header image-block-header">
        <img src="assets/images/comoyoon/aboutus/banner/aboutus-banner-2.jpg" alt="Image" />
      </div>
      <!-- <div
        class="youtube-bg-video"
        data-youtube-bg-video-url="https://www.youtube.com/watch?v=OJOcfylJ29g"
        data-youtube-bg-video-autoplay="yes"
      ></div> -->
    </div>
    <!-- /End Media (Background) -->

    <!-- overlay -->
    <div class="section-overlay dark-1-color-bg" style="opacity: 0.5"></div>

    <!-- Breadcrumb container -->
    <div class="breadcrumb-section-container">
      <!-- container -->
      <div class="container gx-4">
        <!-- row -->
        <div class="row align-items-center justify-content-between">
          <!-- Title -->
          <div class="breadcrumb-title">
            <h1 class="breadcrumb-heading h1 font-weight-600">About us</h1>
            <p class="breadcrumb-sub-heading">FOR YOUR BEANINGFUL MOMENTS</p>
          </div>
          <!-- /End Title -->

          <!-- Breadcrumb -->
          <nav class="breadcrumb-nav">
            <ol class="breadcrumb">
              <li class="breadcrumb-item">
                <router-link
                  class="home"
                  title="Home"
                  aria-current="page"
                  :to="{ name: 'ClientMain' }"
                  ><span><i class="fas fa-home"></i></span
                ></router-link>
                <!-- <a href="index.html" class="home" title="Home">
                                                <span><i class="fas fa-home"></i></span>
                                            </a> -->
              </li>

              <li class="breadcrumb-item active"><span>About us</span></li>
            </ol>
          </nav>
          <!-- /End Breadcrumb -->
        </div>
        <!-- /End row -->
      </div>
      <!-- /End container -->
    </div>
    <!-- /End Breadcrumb container -->
  </div>
  <!-- /End Breadcrumb section -->
  <!-- /End Title -->
</template>

<script>
export default {};
</script>

<style>
</style>