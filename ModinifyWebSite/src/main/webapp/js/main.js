var prefix = (function () {
    var styles = window.getComputedStyle(document.documentElement, ''),
    pre = (Array.prototype.slice
        .call(styles)
        .join('')
        .match(/-(moz|webkit|ms)-/) || (styles.OLink === '' && ['', 'o'])
    )[1],
    dom = ('WebKit|Moz|MS|O').match(new RegExp('(' + pre + ')', 'i'))[1];
    return {
        dom: dom,
        lowercase: pre,
        css: '-' + pre + '-',
        js: pre[0].toUpperCase() + pre.substr(1)
    };
})();

(function(){

    var tamanhoReal,
        tamanhoFinal,
        $current;

    $('.menu a').hover(
        function(){
            if (!$(this).data('width')) {
                $(this).data('width', $(this).children('.progress-bar').find('.prog').css('width'));
            }

            $(this).children('.progress-bar').find('.prog').stop().animate({
                width: '100%'
            }, 300);
        },
        function(){

            $(this).children('.progress-bar').find('.prog').stop().animate({
                width: $(this).data('width')
            }, 300);
        }
    ).on('click', function(e){
        $('html, body').animate({scrollTop: $($(this).attr('href').replace('/', '')).offset().top}, 1200, 'easeInOutExpo');
    });

    $(window)
        .on('scroll', function(){
            var top = $(window).scrollTop();

            $('section').each(function(){
                if (top >= $(this).offset().top) {
                    $current = $(this);
                    return;
                }
            });

            window.location.hash = '#/' + $current.attr('id');
        })
        .on('resize', function(){
            var h       = $(this).height(),
                w       = $(this).width(),
                minH    = 800,
                zoom    = 0,
                css     = {};

            $('section').height(h);

            zoom = h / minH;

            zoom = zoom < 0.7 ? 0.7 : zoom;
            zoom = zoom > 1 ? 1 : zoom;

            if(prefix.dom == 'MS'){
                css['zoom'] = zoom;
            }else{
                var current_w = w * zoom;

                css['width'] = w - current_w;
                css['width'] = css['width'] / current_w;
                css['width'] = (1 + css['width']) * 100;
                css['width'] = css['width'] + '%';

                css[prefix.css + 'transform'] = 'scale(' + zoom + ')';
                css[prefix.css + 'transform-origin'] = '0 0';
                css['margin-bottom'] = -$('#wrapper').height() * (1 - zoom);
            }

            $('#wrapper').css(css);

            if ($current) {
                $('html, body').scrollTop($current.offset().top);
            }
        })
        .trigger('resize');

    if (window.location.hash) {
        $('[href="'+window.location.hash+'"]').eq(0).trigger('click');
    }
})();
