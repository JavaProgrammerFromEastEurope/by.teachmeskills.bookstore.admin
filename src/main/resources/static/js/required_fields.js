(function ($) {
    $(function () {
        $('.rf').each(function () {
            let form = $(this);

            let option = $(".option");
            let four_option = $(".four_option");
            let five_option = $(".five_option");

            let comparison = $(".comparison");
            let four_comparison = $(".four_comparison");
            let five_comparison = $(".five_comparison");

            let second_answer = $(".second_answer");
            let third_answer = $(".third_answer");
            let four_answer = $(".four_answer");
            let five_answer = $(".five_answer");

            $("select.delimiter").change(function () {
                var field = $(this).children("option:selected").val();
                /*checkpanel*/
                if (field === "CheckPanel_3") {
					option.attr('disabled', false);
                    four_option.attr('disabled', true);
                    five_option.attr('disabled', true);

                    comparison.attr('disabled', true);
                    four_comparison.attr('disabled', true);
                    five_comparison.attr('disabled', true);

                    second_answer.attr('disabled', true);
                    third_answer.attr('disabled', true);
                    four_answer.attr('disabled', true);
                    five_answer.attr('disabled', true);

                } else if (field === "CheckPanel_4") {
					option.attr('disabled', false);
                    four_option.attr('disabled', false);
                    five_option.attr('disabled', true);

                    comparison.attr('disabled', true);
                    four_comparison.attr('disabled', true);
                    five_comparison.attr('disabled', true);

                    second_answer.attr('disabled', true);
                    third_answer.attr('disabled', true);
                    four_answer.attr('disabled', true);
                    five_answer.attr('disabled', true);

                } else if (field === "CheckPanel_5") {
					option.attr('disabled', false);
                    four_option.attr('disabled', false);
                    five_option.attr('disabled', false);

                    comparison.attr('disabled', true);
                    four_comparison.attr('disabled', true);
                    five_comparison.attr('disabled', true);

                    second_answer.attr('disabled', true);
                    third_answer.attr('disabled', true);
                    four_answer.attr('disabled', true);
                    five_answer.attr('disabled', true);
                }
                /*multipanel*/
                if (field === "CheckBoxPanel_3") {
					option.attr('disabled', false);
                    four_option.attr('disabled', true);
                    five_option.attr('disabled', true);

                    comparison.attr('disabled', true);
                    four_comparison.attr('disabled', true);
                    five_comparison.attr('disabled', true);

                    second_answer.attr('disabled', false);
                    third_answer.attr('disabled', true);
                    four_answer.attr('disabled', true);
                    five_answer.attr('disabled', true);

                } else if (field === "CheckBoxPanel_4") {
					option.attr('disabled', false);
                    four_option.attr('disabled', false);
                    five_option.attr('disabled', true);

                    comparison.attr('disabled', true);
                    four_comparison.attr('disabled', true);
                    five_comparison.attr('disabled', true);

                    second_answer.attr('disabled', false);
                    third_answer.attr('disabled', true);
                    four_answer.attr('disabled', true);
                    five_answer.attr('disabled', true);

                } else if (field === "CheckBoxPanel_5") {
					option.attr('disabled', false);
                    four_option.attr('disabled', false);
                    five_option.attr('disabled', false);

                    comparison.attr('disabled', true);
                    four_comparison.attr('disabled', true);
                    five_comparison.attr('disabled', true);

                    second_answer.attr('disabled', false);
                    third_answer.attr('disabled', false);
                    four_answer.attr('disabled', true);
                    five_answer.attr('disabled', true);
                }
                /*comparison*/
                if (field === "ComparisonPanel_3") {
					option.attr('disabled', false);
                    four_option.attr('disabled', true);
                    five_option.attr('disabled', true);

                    comparison.attr('disabled', false);
                    four_comparison.attr('disabled', true);
                    five_comparison.attr('disabled', true);

                    second_answer.attr('disabled', true);
                    third_answer.attr('disabled', true);
                    four_answer.attr('disabled', false);
                    five_answer.attr('disabled', false);

                } else if (field === "ComparisonPanel_4") {
					option.attr('disabled', false);
                    four_option.attr('disabled', false);
                    five_option.attr('disabled', true);

                    comparison.attr('disabled', false);
                    four_comparison.attr('disabled', false);
                    five_comparison.attr('disabled', true);

                    second_answer.attr('disabled', false);
                    third_answer.attr('disabled', false);
                    four_answer.attr('disabled', false);
                    five_answer.attr('disabled', true);

                } else if (field === "ComparisonPanel_5") {
					option.attr('disabled', false);
                    four_option.attr('disabled', false);
                    five_option.attr('disabled', false);

                    comparison.attr('disabled', false);
                    four_comparison.attr('disabled', false);
                    five_comparison.attr('disabled', false);

                    second_answer.attr('disabled', false);
                    third_answer.attr('disabled', false);
                    four_answer.attr('disabled', false);
                    five_answer.attr('disabled', false);
                }
                /*input*/
                else  if(field === "Input"){
                    option.attr('disabled', true);
                    four_option.attr('disabled', true);
                    five_option.attr('disabled', true);

                    comparison.attr('disabled', true);
                    four_comparison.attr('disabled', true);
                    five_comparison.attr('disabled', true);

                    second_answer.attr('disabled', true);
                    third_answer.attr('disabled', true);
                    four_answer.attr('disabled', true);
                    five_answer.attr('disabled', true);
                }
            });
        });
    });
})(jQuery);