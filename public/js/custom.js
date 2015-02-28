$(document).ready(function() {

	/*-----------------------------------------------------------------------------------*/
	/*	Smooth Scroll
	/*  Thanks to: https://github.com/davist11/jQuery-One-Page-Nav
	/*-----------------------------------------------------------------------------------*/

	function smoothScroll(){
		$(".nav").onePageNav({
			filter: ':not(.external)',
			scrollSpeed: 1500
		});

		// Scrolls to RSVP section
		$(".js-scroll").click(function() {
			$('html, body').animate({
				scrollTop: $("#section-6").offset().top
			}, 2000);
			return false;
		});

		return false;
	}

	smoothScroll();

	/*-----------------------------------------------------------------------------------*/
	/*	Backstretch
	/*  Thanks to: http://srobbin.com/jquery-plugins/backstretch/
	/*-----------------------------------------------------------------------------------*/

	function backStrech() {
		$("aside").backstretch([
			"https://scontent-a-sea.xx.fbcdn.net/hphotos-frc3/t31.0-8/1658521_10152328683880844_56619524_o.jpg",

			], {duration: 5000, fade: 1000});
	}

	backStrech();

	/*-----------------------------------------------------------------------------------*/
	/*	Flexslider
	/*  Thanks to: http://www.woothemes.com/flexslider/
	/*-----------------------------------------------------------------------------------*/

	function flexSlider(){
		$('.flexslider').flexslider({
			animation: "slide",
			slideshow: false,
			touch: true
		});
	}

	flexSlider();

});

/*-----------------------------------------------------------------------------------*/
/*	Google Map API 
/*  Credit to: http://stiern.com/tutorials/adding-custom-google-maps-to-your-website/
/*-----------------------------------------------------------------------------------*/

function initialize() {
    var map;
    var myLatlng = new google.maps.LatLng(47.60759,-122.343227); // Specify YOUR coordinates
    var MY_MAPTYPE_ID = 'custom_style';

	var mapOptions = {
		zoom: 17,
		center: myLatlng,
		disableDefaultUI: true,
		scrollwheel: true,
		draggable: true,
		mapTypeControlOptions: {
			mapTypeIds: [google.maps.MapTypeId.ROADMAP, MY_MAPTYPE_ID]
		},
		mapTypeId: MY_MAPTYPE_ID
	};

	map = new google.maps.Map(document.getElementById('map-canvas-kara'), mapOptions);

    var featureOpts = [
      {
        stylers: [
          { hue: "#00ffe6" },
          { saturation: -20 }
        ]
      },
      {
        featureType: "road",
        elementType: "geometry",
        stylers: [
          { lightness: 100 },
          { visibility: "simplified" }
        ]
      },
      {
        featureType: "road",
        elementType: "labels",
        stylers: [
          { visibility: "off" }
        ]
      }
    ];
 
	var styledMapOptions = {
		name: 'Custom Style'
	};

	var customMapType = new google.maps.StyledMapType(featureOpts, styledMapOptions);

	// Includes custom marker on map
	var myLatLng = new google.maps.LatLng(47.60759,-122.343227);
	var beachMarker = new google.maps.Marker({
		position: myLatLng,
		map: map,
		icon: "https://s3-us-west-2.amazonaws.com/kelron-play-2/whale.jpg"
	});
	
	var myLatLng = new google.maps.LatLng(47.608858,-122.341836);
	var beachMarker = new google.maps.Marker({
		position: myLatLng,
		map: map,
    icon: "https://s3-us-west-2.amazonaws.com/kelron-play-2/parking.jpg"
	});

	map.mapTypes.set(MY_MAPTYPE_ID, customMapType);

}

google.maps.event.addDomListener(window, 'load', initialize);
