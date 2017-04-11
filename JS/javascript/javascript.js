/*$("#canvas").click(function(e){
     getPosition(e); 
});*/

document.getElementById("canvas").addEventListener('click', function (event){
	var rect = canvas.getBoundingClientRect();
	var x = event.clientX-rect.left;
	var y = event.clientY-rect.top;


	drawCoordinates(x,y);
});

function drawCoordinates(x,y){
	var pointSize = 6;
	var ctx = document.getElementById("canvas").getContext('2d');

	ctx.fillStyle = '#000000';

	ctx.beginPath();
	ctx.arc(x,y,pointSize,0,Math.PI*2,true);
	ctx.fill();
}

function clearCoordinates(x,y){
	var pointSize = 6;
	var ctx = document.getElementById("canvas").getContext('2d');

	ctx.fillStyle = '#ffffff';

	ctx.beginPath();
	ctx.arc(x,y,pointSize,0,Math.PI*2,true);
	ctx.fill();
}


