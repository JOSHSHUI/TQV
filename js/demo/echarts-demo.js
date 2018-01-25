$(function () {
    var lineChart = echarts.init(document.getElementById("echarts-line-chart"));
    var lineoption = {
        title: {
            text: '近六次考试语数外成绩'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data: ['语文', '数学', '英语']
        },
        grid: {
            x: 40,
            x2: 40,
            y2: 24
        },
        calculable: true,
        xAxis: [
            {
                type: 'category',
                boundaryGap: false,
                data: ['一', '二', '三', '四', '五', '六']
            }
        ],
        yAxis: [
            {
                type: 'value',
                axisLabel: {
                    formatter: '{value} 分'
                }
            }
        ],
        series: [
            {
                name: '语文',
                type: 'line',
                data: [110, 110, 90, 130, 120, 130, 100],
                markPoint: {
                    data: [
                        {type: 'max', name: '语文巅峰'},
                        {type: 'min', name: '语文低谷'}
                    ]
                }
            },
            {
                name: '数学',
                type: 'line',
                data: [110, 70, 90, 150, 80, 100, 120],
                markPoint: {
                    data: [
                        {type: 'max', name: '数学巅峰'},
                        {type: 'min', name: '数学低谷'}
                    ]
                }
            },
            {
                name: '英语',
                type: 'line',
                data: [55, 60, 90, 80, 65, 70, 60],
                markPoint: {
                    data: [
                        {type: 'max', name: '英语巅峰'},
                        {type: 'min', name: '英语低谷'}
                    ]
                }
            }
        ]
    };
    lineChart.setOption(lineoption);
    $(window).resize(lineChart.resize);

    var barChart = echarts.init(document.getElementById("echarts-bar-chart"));
    var baroption = {
        title: {
            text: '近六次考试总成绩'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data: ['总成绩']
        },
        grid: {
            x: 30,
            x2: 40,
            y2: 24
        },
        calculable: true,
        xAxis: [
            {
                type: 'category',
                data: ['1', '2', '3', '4', '5', '6']
            }
        ],
        yAxis: [
            {
                type: 'value'
            }
        ],
        series: [
            {
                name: '总成绩',
                type: 'bar',
                data: [605, 540, 500, 467, 456, 467],
                markPoint: {
                    data: [
                        {type: 'max', name: '巅峰时刻'},
                        {type: 'min', name: '无底深渊'}
                    ]
                },
                markLine: {
                    data: [
                        {type: 'average', name: '平均成绩'}
                    ]
                }
            },
        ]
    };
    barChart.setOption(baroption);
    window.onresize = barChart.resize;

    var barChart = echarts.init(document.getElementById("echarts-bar-chart"));
    var baroption = {
        title: {
            text: '近六次考试总成绩'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data: ['总成绩']
        },
        grid: {
            x: 30,
            x2: 40,
            y2: 24
        },
        calculable: true,
        xAxis: [
            {
                type: 'category',
                data: ['1', '2', '3', '4', '5', '6']
            }
        ],
        yAxis: [
            {
                type: 'value'
            }
        ],
        series: [
            {
                name: '总成绩',
                type: 'bar',
                data: [605, 540, 500, 467, 456, 467],
                markPoint: {
                    data: [
                        {type: 'max', name: '巅峰时刻'},
                        {type: 'min', name: '无底深渊'}
                    ]
                },
                markLine: {
                    data: [
                        {type: 'average', name: '平均成绩'}
                    ]
                }
            },
        ]
    };
    barChart.setOption(baroption);
    window.onresize = barChart.resize;

    var pieChart = echarts.init(document.getElementById("echarts-pie-chart"));
    var pieoption = {
        title: {
            text: '最近一次考试各科成绩',
            subtext: '纯属虚构',
            x: 'center'
        },
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            x: 'left',
            data: ['语文', '数学', '英语', '物理', '化学', '生物', '历史', '地理']
        },
        calculable: true,
        series: [
            {
                type: 'pie',
                radius: '55%',
                center: ['50%', '60%'],
                data: [
                    {value: 110, name: '语文'},
                    {value: 130, name: '数学'},
                    {value: 99, name: '英语'},
                    {value: 86, name: '物理'},
                    {value: 77, name: '化学'},
                    {value: 86, name: '生物'},
                    {value: 66, name: '历史'},
                    {value: 97, name: '地理'}
                ]
            }
        ]
    };
    pieChart.setOption(pieoption);
    $(window).resize(pieChart.resize);
});