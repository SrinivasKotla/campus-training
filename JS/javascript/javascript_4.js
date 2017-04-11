
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
		clear.clearRect(0,0,690,651);
		var dot = new point(x,y);
		points.push(dot);
		var circle = createCircle(points);
		clear.fillStyle = '#E0E0E0';
		clear.beginPath();
		clear.arc(circle.x,circle.y,circle.radius,0,Math.PI*2,true);
		clear.fill();
		for(var j=0;j<points.length;j++){
		if(points.length>0)
			drawCoordinates(points[j].x,points[j].y);
		}
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

function createCircle(points){
	var a = 0;
	var b = 0;

	for(var i=0;i<points.length;i++){
		a += points[i].x;
	}
	for(var i=0;i<points.length;i++){
		b += points[i].y;
	}
	a = a/points.length;
	b = b/points.length;

	var r = distance(a,points[0].x,b,points[0].y);	
	for(var i=0;i<points.length;i++){
		var dist = distance(a,points[i].x,b,points[i].y);
		if(r < dist)
			r = dist;
	}
	
	var c={ x : a, y : b, radius : r}	
	return c;
}

function distance(x0,x1,y0,y1){
	return Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1));
}

