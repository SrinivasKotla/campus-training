
function point(x,y,bool){
	this.x = x;
	this.y = y;
};

var points = [];

document.getElementById("canvas").addEventListener('click', function (event){
	var clear = document.getElementById("canvas").getContext('2d');
	var rect = canvas.getBoundingClientRect();
	var x = event.clientX-rect.left;
	var y = event.clientY-rect.top;
	var i=0;
	while(i<points.length && points[i].x !=x && points[i].y !=y){
		i++;
	}
	if(i === points.length){
		drawCoordinates(x,y);
		var dot = new point(x,y);
		points.push(dot);
	}
	else{
		points.splice(i,1);
		clear.clearRect(0,0,690,651);
		for(var j=0;j<points.length;j++){
			if(points.length>0)
			drawCoordinates(points[j].x,points[j].y);
		}
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
