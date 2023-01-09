<template>
  <!-- Page body
                ============================================================ -->
  <div id="page-body" class="page-body">
    <!-- container -->
    <div class="container gx-4">
      <!-- row -->
      <div class="row main-row justify-content-center">
        <!-- Post media
                            ================================================ -->
        <div class="post-media col-lg-12">
          <!-- Block container -->
          <div class="post-media-container">
            <!-- Block header -->
            <div class="post-media-header text-center">
              <img
                src="@/assets/images/comoyoon/promotion/promotion-3.jpg"
                alt="Article image"
              />
            </div>
            <!-- /End Block header -->
          </div>
          <!-- /End Block container -->
        </div>
        <!-- /End Post media -->

        <div id="primary" class="content-area col-lg-8">
          <!-- Main -->
          <main id="main" class="content-area-container site-main">
            <div class="blog-block-wrapper">
              <!-- row -->
              <div class="row gx-36">
                <!-- Post -->
                <div class="blog-block-post col-lg-12">
                  <article
                    class="
                      main-block
                      blog-block blog-block-inner
                      format-standard
                    "
                  >
                    <div
                      class="
                        main-block-container
                        blog-block-container blog-block-inner-container
                      "
                    >
                      <!-- Block body -->
                      <div
                        class="
                          main-block-body
                          blog-block-body blog-block-inner-body
                        "
                      >
                        <!-- Block heading -->
                        <div
                          class="
                            main-block-heading
                            blog-block-heading blog-block-inner-heading
                            text-center
                          "
                        >
                          <h2>2022 HOLIDAY PARIS-SEOUL DE NOEL</h2>

                          <ul class="meta-block">
                            <li class="meta-block-author">
                              <span><a href="#">Admin</a></span>
                            </li>
                            <li class="meta-block-date">
                              <span><a href="#">May 17, 2021</a></span>
                            </li>
                            <li class="meta-block-category">
                              <span><a href="#">Standard</a></span>
                            </li>
                            <li class="meta-block-comments">
                              <span
                                ><a href="#comments" class="data-scroll-to"
                                  >No Comments</a
                                ></span
                              >
                            </li>
                            <li class="meta-block-views">
                              <span><i class="far fa-eye"></i>20</span>
                            </li>
                          </ul>
                        </div>
                        <!-- /End Block heading -->

                        <div
                          class="
                            main-block-content
                            blog-block-content blog-block-inner-content
                          "
                        >
                          <p>
                            영국 출신 플로리스트와 스위스 출신 파티시에가 만나
                            만들어내는 2022 크리스마스 스토리를 소개합니다. * 더
                            높은 퀄리티를 위해 한정수량으로 제작되며, 다산점 /
                            성수점 합 60개만 판매됩니다.
                          </p>

                          <p>
                            Golden Preserved Flower 골드 프리저브드 플라워
                            Hazelnut Pralinée 헤이즐넛 프랄리네 Choux au
                            Chocolat 초콜릿 슈 Ferrero Gianduja Ganache 페레로
                            잔두야 가나슈 Crème Mousseline au Chocolat 초콜릿
                            무셀린 크림 Caramelized Hazelnut Crunch 헤이즐넛
                            카라멜리제 Pâte à Glacer 파트아 글라세
                          </p>

                          <p>
                            [안내 사항] > 1단 (2-3인용) : 41,000원 > 36,900
                            (10%할인가) > 2단 (4-6인용) : 58,000원 > 52,200
                            (10%할인가) > 사전예약 10%할인기간: 12.8목-12.14수 >
                            일반예약 12.15목-12.25일 > 픽업기간 12.22목-12.25일
                            > 픽업가능시간 11:00-20:00 * 최소 픽업 2일전 예약
                            필수
                          </p>

                          <p>
                            [주문시 필수사항] 1. 품목: 파리서울 드 노엘 2.
                            사이즈선택: 1단 / 2단 3. 픽업지점: 성수점(수휴무) /
                            다산점(화휴무) 4. 픽업날짜: 12.22목 -12.25일 5.
                            픽업시간: 11:00-20:00 6. 예약자명 / 연락처 : *
                            디저트 특성상 퀵 및 택배배송 불가 [보관 및 섭취방법]
                            > 섭취가 불가한 꼬모윤 종이 케이크픽 골드 프리저브드
                            / 씰 스템프는 소독하여 올라갑니다. > 당일 섭취를
                            가장 권장드리며, 냉장보관은 필수 입니다 냉장보관시
                            최대2-3일까지 섭취 가능합니다. 🎅🏻 예약 및 문의:
                            카카오채널 꼬모윤 / 인스타그램 comoyoon
                          </p>
                        </div>
                        <!-- /End Block content -->
                      </div>
                    </div>
                  </article>
                </div>
              </div>
            </div>
          </main>
        </div>
      </div>
    </div>
  </div>
  <h1>{{promotionId}}</h1>
</template>

<script>
import {useRoute} from 'vue-router';
export default {
  

  setup() {
    const router = useRoute();
    const promotionId = router.params.id;

    window.location.href = "#we";

    return {
        promotionId
    }
  },
};
</script>

<style>
</style>