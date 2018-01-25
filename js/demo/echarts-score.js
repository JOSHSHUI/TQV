$(function () {
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

    var barChart1 = echarts.init(document.getElementById("echarts-bar-chart1"));
    var baroption1 = {
        title: {
            text: '较上次考试，三科成绩柱状图'
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
    barChart1.setOption(baroption1);
    window.onresize = barChart1.resize;

    var barChart2 = echarts.init(document.getElementById("echarts-bar-chart2"));
    var baroption2 = {
        title: {
            text: '上次考试各科信息'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data: ['全部成绩']
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
                data: ['语文', '数学', '外语', '物理', '化学', '政治','生物','地理','历史']
            }
        ],
        yAxis: [
            {
                type: 'value'
            }
        ],
        series: [
            {
                name: '全部成绩',
                type: 'bar',
                data: [60, 54, 50, 46, 45, 46,77,77,77],
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
    barChart2.setOption(baroption2);
    window.onresize = barChart2.resize;

});