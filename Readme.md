Для определения попадает ли точка в треугольник заданный тремя координатоми A, B, C
используется **метод площадей**.

### Описание алгоритма
1. Вычисляем площадь треугольника по его координатам с помощью формулы Герона
2. Вычисляем площадь трех малых треугольников гле вершиной является определяемая точка P
3. Если сумма треха малых площадей количественно равна площади всего треугольника => точка Р принадлежит треугольнику.
4. Так же задаётся некоторая погрешность вычисления EPS


https://rosettacode.org/wiki/Find_if_a_point_is_within_a_triangle