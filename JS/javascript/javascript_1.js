/*$("#canvas").click(function(e){
     getPosition(e); 
});*/

function point(x,y,bool){
	this.x = x;
	this.y = y;
	this.bool = bool;
};
var points = [];
drawCoordinates(10,10);
var dot = new point(10,10,true);
clearCoordinates(10,10);
document.getElementById("canvas").addEventListener('click', function (event){
	var rect = canvas.getBoundingClientRect();
	var x = event.clientX-rect.left;
	var y = event.clientY-rect.top;
	var i=0;
	while(i<points.length && points[i].x !=x && points[i].y !=y){
		i++;
	}
	if(i === points.length){
		drawCoordinates(x,y);
		var dot = new point(x,y,true);
		points.push(dot);
	}
	else{
		clearCoordinates(x,y)
		points[i].bool = false;
	}
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


