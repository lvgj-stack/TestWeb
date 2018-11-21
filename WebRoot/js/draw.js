/**
* for draw
*/

window.onload = function(){
	Highcharts.chart('container', {
        chart: {
            type: 'spline',
            animation: false   , // don't animate in old IE
            marginRight: 0,
            events: {
                load: function () {
                        
                    // set up the updating of the chart each second
                    var series = this.series[0];
                    setInterval(function () {
                        var x = (new Date()).getTime(), // current time
                            y = Math.random();
                        series.addPoint([x,y], true, true);
                    },40);
                }
            }
        },
        plotOptions: {
            spline: {
                lineWidth: 4,
                states: {
                    hover: {
                        lineWidth: 5
                    }
                },
                marker: {
                    enabled: false
                    //radius: 10
                },
                pointStart: 0

            }
        },

        time: {
            useUTC: false
        },

        title: {
            text: '脑电图'
        },
        xAxis: {
         type: 'datetime',
         tickPixelInterval: 100
         
        },
        yAxis: {
            title: {
                text: ''
            },
            // plotLines: [{
            //     value: 0,
            //     width: 1,
            //     color: '#808080'
            // }]
        },
        // tooltip: {
        //     headerFormat: '<b>{series.name}</b><br/>',
        //     pointFormat: '{point.x:%Y-%m-%d %H:%M:%S}<br/>{point.y:.2f}'
        // },
        legend: {
            enabled: true
        },
        exporting: {
            enabled: true
        },

        series: [{
            name: '',
            data: (function () {
                // generate an array of random data
                var data = [],
                    time = (new Date()).getTime(),
                    i;

                for (i = -100; i <= 0; i += 1) {
                    data.push({
                        x: time + i * 50,
                        y: Math.random() 
                    });
                }
                return data;
            }())
        }]
    });
}