<template>
  <header
    class="
      header-section
      header-section-fixed
      header-section-transparent
      header-section-transparent-light
    "
    id="we"
  >
    <!-- Header section container -->
    <div class="header-section-container">
      <!-- Header menu section -->
      <div class="header-menu-section">
        <!-- Header menu section container -->
        <div class="header-menu-section-container">
          <!-- Navbar -->
          <nav class="navbar navbar-expand-lg">
            <!-- container -->
            <div class="container gx-4">
              <!-- Logo -->
              <a class="navbar-brand" href="index.html" title="COMO">
                <div class="transparent" alt="COMO">
                  <h4 class="font-weight-900" style="color: white">COMOYOON</h4>
                </div>
                <div class="normal" alt="COMO" style="color: black">
                  <h4 class="font-weight-900">COMOYOON</h4>
                </div>
              </a>
              <!-- /End Logo -->

              <!-- Toggler button -->
              <button
                class="navbar-toggler"
                type="button"
                data-bs-toggle="collapse"
                data-bs-target="#mobile-menu"
                aria-controls="mobile-menu"
                aria-expanded="false"
                aria-label="Toggle navigation"
              >
                <span class="navbar-toggler-wd">MENU</span>
                <span class="navbar-toggler-lines-wrapper">
                  <i class="navbar-toggler-line navbar-toggler-line-top"></i>
                  <i class="navbar-toggler-line navbar-toggler-line-middle"></i>
                  <i class="navbar-toggler-line navbar-toggler-line-bottom"></i>
                </span></button
              ><!-- /End Toggler button -->
              <!-- Header menu (Desktop) -->
              <div class="header-menu desktop-menu navbar-collapse">
                <!-- Header menu links -->
                <ul class="navbar-nav ms-auto">
                  <!-- Home -->
                  <li class="nav-item">
                    <router-link class="nav-link" :to="{ name: 'ClientMain' }"
                      ><span>HOME</span></router-link
                    >
                    
                  </li>
                  <!-- Portfolio -->
                  <li class="nav-item">
                    <router-link class="nav-link" :to="{ name: 'AboutUs' }"
                      ><span>ABOUT US</span></router-link
                    >
                    
                  </li>

                  <!-- Shop -->
                  <li class="nav-item">
                    <router-link class="nav-link" :to="{ name: 'Promotion' }"
                      ><span>PROMOTION</span></router-link
                    >
                  
                  </li>

                  <!-- Blog -->
                  <li class="nav-item">
                    <!-- <router-link class="nav-link" :to="{ name: 'Flower' }"
                      ><span>FLOWER</span></router-link
                    > -->
                    FLOWER
                  </li>

                  <!-- Pages -->
                  <li class="nav-item megamenu">
                    <!-- <router-link class="nav-link" :to="{ name: 'Dessert' }"
                      ><span>DESSERT</span></router-link
                    > -->
                    DESSERT
                  </li>

                  <!-- Elements -->
                  <li class="nav-item megamenu">
                    <!-- <router-link class="nav-link" :to="{ name: 'Reservation' }"
                      ><span>RESERVATION</span></router-link
                    > -->
                    RESERVATION
                  </li>
                </ul>
                <!-- /End Header menu links -->
              </div>
              <!-- /End Header menu (Desktop) -->
            </div>
            <!-- /End container -->

            <!-- Header menu (Mobile) -->
            <div
              class="header-menu mobile-menu collapse"
              id="mobile-menu"
            ></div>
            <!-- /End Header menu (Mobile) -->
          </nav>
          <!-- /End Navbar -->
        </div>
        <!-- /End Header menu section container -->
      </div>
      <!-- /End Header menu section -->
    </div>
    <!-- /End Header section container -->
  </header>
  <!-- /End Header section -->
</template>

<script>
export default {};
</script>

<style>
</style>