<template>
  <!-- Page body
                ============================================================ -->
  <div id="page-body" class="page-body">
    <!-- container -->
    <div class="container gx-4">
      <!-- row -->
      <div class="row main-row justify-content-center">
        <!-- Content area
                            ================================================ -->
        <div id="primary" class="content-area col-lg-8">
          <!-- Main -->
          <main id="main" class="content-area-container site-main">
            <!-- Blog wrapper -->
            <div
              class="
                blog-block-wrapper
                blog-block-standard
                blog-block-front
                blog-block-cols-1
              "
            >
              <!-- Loop -->
              <div class="row gx-36 gy-0 row-cols-1 grid-wrapper">
                <!-- COTENT -->

                <!-- Grid item -->
                <div class="grid-item">
                  <!-- Post -->
                  <article class="main-block blog-block format-standard">
                    <!-- Block container -->
                    <div class="main-block-container blog-block-container">
                      <!-- Block header -->
                      <div class="main-block-header blog-block-header">
                        <a href="#">
                          <img
                            src="@/assets/images/comoyoon/promotion/promotion-3.jpg"
                            alt="Article image"
                          />
                        </a>
                      </div>
                      <!-- /End Block header -->

                      <!-- Block body -->
                      <div class="main-block-body blog-block-body">
                        <!-- Block heading -->
                        <div class="main-block-heading blog-block-heading">
                          <h2 class="h5 title">
                            <a href="#">2022 HOLIDAY PARIS-SEOUL DE NOEL</a>
                          </h2>

                          <ul class="meta-block">
                            <li class="meta-block-author">
                              <span>Yoon</span>
                            </li>
                            <li class="meta-block-date">
                              <span>2022-12-12</span>
                            </li>
                            <li class="meta-block-category">
                              <span>Standard</span>
                            </li>
                            <li class="meta-block-comments">
                              <span>No Comments</span>
                            </li>
                            <li class="meta-block-views">
                              <span><i class="far fa-eye"></i>20</span>
                            </li>
                          </ul>
                        </div>
                        <!-- /End Block heading -->

                        <!-- Block content -->
                        <div class="main-block-content blog-block-content">
                          <p>
                            영국 출신 플로리스트와 스위스 출신 파티시에가 만나
                            만들어내는 2022 크리스마스 스토리를 소개합니다. * 더
                            높은 퀄리티를 위해 한정수량으로 제작되며, 다산점 /
                            성수점 합 60개만 판매됩니다.
                          </p>
                        </div>
                        <!-- /End Block content -->

                        <!-- Block footer -->
                        <div class="main-block-footer blog-block-footer">
                          <a  @click="moveToPromotionDetail(1)" class="btn btn-accent btn-sm">
                            <span>READ MORE</span>
                          </a>
                          <a   class="read-more-link font-size-12">
                            <i class="fas fa-plus"></i> READ MORE
                          </a>

                          
                        </div>
                        <!-- /End Block footer -->
                      </div>
                      <!--/End Block body -->
                    </div>
                    <!-- /End Block container -->
                  </article>
                  <!-- /End Post -->
                </div>
                <!-- /End Grid item -->
              </div>
            </div>
          </main>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import {useRouter} from 'vue-router';
export default {
    setup() {
        const router = useRouter();
        const moveToPromotionDetail = (promotionId) => {
            router.push({
                name: 'PromotionDetail',
                params: {
                    id: promotionId
                }
            })
        }

        return {
            moveToPromotionDetail
        }
    }

  
};
</script>

<style>
</style>