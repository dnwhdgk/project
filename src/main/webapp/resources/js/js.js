$(function() {function upnav () {
    document.addEventListener('scroll', onScroll, { passive: true });
   let last = 0;
    const gap = 1;
    const nav = document.querySelector('nav');
    const headerheight = document.querySelector('header').clientHeight;
  function onScroll()
  {
    
    const scrollposition = pageYOffset;
  
    if (Math.abs(last - scrollposition) <= gap) return;
    else if (scrollposition > last || scrollposition<= headerheight)
    {
      nav.classList.remove("downdown");
    }
    else if (scrollposition<last)
    { 
        nav.classList.add("downdown");  
    }
  
    last = scrollposition;
  }
  }
  upnav();

  $(".sub_mn").css({ height: "0px" });
  $(".sub_nav").css({ height: "0px" });

  $("nav").mouseenter(function () {
    $(".sub_mn").stop().animate({ height: "270px" }, 200);
    $(".sub_nav").stop().animate({ height: "270px" }, 200);
    $(".sub_mn > li > a").css({"color": "#fff;"});
    $(".member li a").css({"color": "#000;"});
  });

  $(".sub_mn").mouseleave(function () {
    $(".sub_mn").stop().animate({ height: "0px" }, 200);
    $(".sub_nav").stop().animate({ height: "0px" }, 200);
    $(".sub_mn > li > a").css({"color": "#000;"});
    $(".member li a").css({"color": "#fff;"});
  });

  

  var lastScroll = 0;
$(window).scroll(function(e){
  // e.preventDefault();
     var scroll = $(this).scrollTop();
     if (scroll > 1000){
     //이벤트를 적용시킬 스크롤 높이
          $("nav").addClass("on");
          $("nav a").addClass("on1");
    }
     else {
          $("nav").removeClass("on");
          $("nav a").removeClass("on1");
     }
     lastScroll = scroll;
    });


  $(".family_sub").hide();
  $("#f_s li").click(function(e) {
      e.preventDefault();
      $(this).find("ul").stop().slideToggle();
  });

  $(window).fadeThis(); 

  // $("html").easeScroll({
  //   frameRate: 60,
  //   animationTime: 1500,
  //   stepSize: 120,
  //   pulseAlgorithm: !0,
  //   pulseScale: 8,
  //   pulseNormalize: 1,
  //   accelerationDelta: 20,
  //   accelerationMax: 1,
  //   keyboardSupport: !0,
  //   arrowScroll: 50,
  // });


var moving=false; // 현재 움직이는 상황 여부를 점검하는 변수
var num=0; //키비주얼의 위치 번호를 나타내는 변수

function doLayout(){
	
	var w=window.innerWidth*(-1)*num;
    // 현재 윈도울창의 가로 크기 영역
	

	// $(".space_img").css({left:w});
	$(".space_img .page").removeClass("loading")
	.each(function(){
		console.log("index : "+$(this).index());
		$(this).css({left:window.innerWidth*($(this).index()), width:window.innerWidth, height:innerHeight});
	});
}
  doLayout();
	

});

    // 2) mouse wheel event
	$(".space_img").mousewheel(function(e){
    e.preventDefault();
    
      if(!moving){
        moving=true;// 반복적인 이벤트를 방지하기 위해 적용, 마우스휠 이벤트에서 필수적으로 필요한 변수
        var w=window.innerWidth;
        var offsetL=$(".space_img").offset().left;
        console.log(e.deltaX, e.deltaY, e.deltaFactor);
  
        if(e.deltaY == -1){ // 아래로 휠 할 경우
          if(num < 4){
            num+=1;
            offsetL-=w;
          }
        }else if(e.deltaY == 1){//위로 휠 할 경우
          if(num > 0){
            num-=1;
            offsetL+=w;
          }
        }
        $(".space_img").animate({left:offsetL}, 800, function(){
          moving=false; 
          
        });
      }
    
		
	});








  // $('.space_img').niceScroll({
  //   bouncescroll : "true",
  //   disableoutline : "false",
  // });

  // $(function(){ 
  //   let d_width = 0; 
  //   // 브라우저 가로 
  //   let d_height = 0; 
  //   // 문서 전체의 높이 
  //   function tmp() { 
  //     // container의 가로사이즈(화면가로 * box 개수) 
  //     let con_width = $(window).outerWidth() * $('.box').length; 
  //     // $('.space_img').css({ width: con_width, height: '100vh', position: 'fixed', top: 0, left: 0 }); 
  //     // css에서 해도 상관없다. 
  //     $('.box').css({ width: con_width / $('.box').length, height: '969px', float: 'left' }); 
  //     // box들을 위로 끌어올렸기 때문에 body의 높이는 100vh나 마찬가지인 상태. 
  //     // 그래서 억지로 전체 box들의 세로크기 만큼 body에 줘야한다.(스크롤 내리기위함) 
  //     // 이때 높이는 가로영역의 비율과 동일하게 준다. (이후 리미트를 주게 됨으로써 비율의 값이 정해진다.) 
  //     $('body').css({ height: '969px' }); 
  //     let w_width = $(window).width(); 
  //     // 화면의 가로값 
  //     let w_height = $(window).height() 
  //     // 화면의 세로값 
  //     // 스크롤 될때의 리미트 
  //     d_width = con_width - w_width; 
  //     // 전체 가로값 - 현재 화면의 가로값 
  //     d_height = $('body').height() - w_height;
  //     // 전체 세로값 - 현재 화면의 세로값 
  //   } 
  //   tmp(); 
  //   let array = []; 
  //   for(let i=0; i<$('.box').length; i++) {
  //      array[i] = $('.box').eq(i).offset().left } 
  //      let chk = true; 
  //      $('.box').on('mousewheel DOMMouseScroll', function(){ 
  //     if(chk) { 
  //       // 휠 일정시간동안 막기 
  //       chk = false; 
  //       setTimeout(function(){ chk = true; }, 300) 

  //       // 휠 방향 감지(아래: -120, 위: 120) 
  //       let w_delta = event.wheelDelta / 300; 

  //       // 휠 아래로 
  //       if(w_delta < 0 && $(this).next().length > 0) 
  //       { $('.space_img').animate({ left: -array[$(this).index()+1] }, 500) } 

  //       // 휠 위로 
  //       else if(w_delta > 0 && $(this).prev().length > 0) 
  //       { $('.space_img').animate({ left: -array[$(this).index()-1] }, 500) } } });

  //       //브라우저를 resize했을시를 대비해 박스의 크기는 다시 구해준다. 
  //       $(window).resize(function(){ for(let i=0; i<$('.box').length; i++) {
  //         array[i] = $('.box').eq(i).offset().left } 
  //         tmp(); 
  //       });
  //     });
  // 3100

