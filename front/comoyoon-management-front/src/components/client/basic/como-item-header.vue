<template>
<div style="background:black">
    <br>
    <br>
    <br>
</div>


  <!-- Breadcrumb section
                ============================================================ -->
  <div class="breadcrumb-section breadcrumb-section-layout-1 text-center">
    <!-- Breadcrumb container -->
    <div class="breadcrumb-section-container">
      <!-- container -->
      <div class="container gx-4">
        <!-- row -->
        <div class="row align-items-center justify-content-between">
          <!-- Title -->
          <div class="breadcrumb-title">
            <h1 class="breadcrumb-heading h5 font-weight-500">{{headerName}}</h1>
          </div>
          <!-- /End Title -->

          <!-- Breadcrumb -->
          <nav class="breadcrumb-nav">
            <ol class="breadcrumb">
              <li class="breadcrumb-item">
                <a href="/" class="home" title="Home">
                  <span><i class="fas fa-home"></i></span>
                </a>
              </li>

              <li class="breadcrumb-item active">
                <span>{{headerName}}</span>
              </li>
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
</template>

<script>
export default {
  props: {
    headerName: {
      type: String,
    },
  },
  setup() {

    return {

    }
  }
};
</script>

<style>
</style>