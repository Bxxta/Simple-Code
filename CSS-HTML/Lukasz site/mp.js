		<script>
		var width = screen.width;
		var height = screen.height;
		var container = document.getElementById("mp_container");
		var text = 	document.getElementById("mp_text1");
		var text2 = document.getElementById("mp_text2");
		var text3 = document.getElementById("mp_text3");
		var text4 = document.getElementById("mp_text4");
		var text5 = document.getElementById("mp_text5");
		var img = document.getElementById("img");
		var icon1 = document.getElementById("icon1");
		var icon2 = document.getElementById("icon2");
		var icon3 = document.getElementById("icon3");
		
		function deleteScale ()
		{
		icon1.classList.remove("js_mp_scale")
		}
		
		function deleteScale2 ()
		{
		icon2.classList.remove("js_mp_scale")
		}

		function deleteScale3 ()
		{
		icon3.classList.remove("js_mp_scale")
		}
		
		function nextIcon ()
		{
		icon2.classList.remove("mp_js_hidden");
		icon2.classList.add ("js_mp_AnimationIcon");
		}	
		
		function nextIcon2 ()
		{
		icon3.classList.remove("mp_js_hidden");
		icon3.classList.add ("js_mp_AnimationIcon");
		}	
		
		function mpImageAnimation ()
		{
			img.innerHTML = '<img src="Images/avatar.png">';
			img.classList.add ("js_mp_image_opacity");
			icon1.classList.remove("mp_js_hidden");
			icon1.classList.add ("js_mp_AnimationIcon");
			setTimeout ( deleteScale , 300);
			setTimeout (nextIcon, 100);
			setTimeout (deleteScale2, 300);
			setTimeout (nextIcon2, 100);
			setTimeout (deleteScale3 , 300);
			
		}

		
		onload.window = function ()
		{
		if 	((width == 1280) && (height == 600))
			{
			container.backgroundColor ("red");
			}
	
		function mpAnimation()
		{
		    container.classList.add("js_mp_Text_animation");
		    setTimeout(mpImageAnimation , 500);

		}
		</script>