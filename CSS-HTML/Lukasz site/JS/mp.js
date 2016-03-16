		var afterForm = document.getElementById("mpShowAfter");
		var h_container = document.getElementById("mp_hidden_httml");
		var container = document.getElementById("mp_container");
		var text = 	document.getElementById("mp_text1");
		var text2 = document.getElementById("mp_text2");
		var text3 = document.getElementById("mp_text3");
		var text4 = document.getElementById("mp_text4");
		var text5 = document.getElementById("mp_text5");
		var img = document.getElementById("img");
		var iconContainer = document.getElementById("mp_icon_container");
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
			icon1.classList.remove("mp_js_hidden");
			icon1.classList.add ("js_mp_AnimationIcon");
			setTimeout ( deleteScale , 300);
			setTimeout (nextIcon, 100);
			setTimeout (deleteScale2, 300);
			setTimeout (nextIcon2, 100);
			setTimeout (deleteScale3 , 300);
			
		}
		
		
		function deleteOpacity ()
		{
		img.classList.remove ("js_mp_opacity");
		img.classList.add ("js_mp_image_opacity");
		}

	
		function mpAnimation()
		{
			img.classList.add ("js_mp_opacity");
			setTimeout (deleteOpacity , 300);
		    setTimeout(mpImageAnimation , 500);
		}
		
		
		
		 icon1.onmouseover  = function ()
		 {
		icon1.removeAttribute ('src' , 'Images/Twitter.png');
		icon1.setAttribute ('src' , 'Images/afterTwitter.png');
		 }
		 icon1.onmouseout = function ()
		 { 
		 icon1.removeAttribute ('src' , 'Images/afterTwitter.png');
		 icon1.setAttribute ('src' , 'Images/twitter.png');
		 }
		 
		  icon2.onmouseover  = function ()
		 {
		icon2.removeAttribute ('src' , 'Images/linkedin.png');
		icon2.setAttribute ('src' , 'Images/afterLinkedin.png');
		 }
		 
		 icon2.onmouseout = function ()
		 { 
		 icon2.removeAttribute ('src' , 'Images/afterLinkedin.png');
		 icon2.setAttribute ('src' , 'Images/linkedin.png');
		 }
		 
		 icon3.onmouseover  = function ()
		 {
		icon3.removeAttribute ('src' , 'Images/mail.png');
		icon3.setAttribute ('src' , 'Images/afterMail.png');
		 }
		 
		 icon3.onmouseout = function ()
		 { 
		 icon3.removeAttribute ('src' , 'Images/afterMail.png');
		 icon3.setAttribute ('src' , 'Images/mail.png');
		 }
		 
		 icon1.onclick = function ()
		 {
		  window.location.href = "http://google.com";
		 }
		 
		 		 
		 icon2.onclick = function ()
		 {
		  window.location.href = "http://linkedin.com";
		 }
		 
		 icon3.onclick = function ()
		 {
		 window.open('mailto:lukasz@zmudzinski.me');
		 }