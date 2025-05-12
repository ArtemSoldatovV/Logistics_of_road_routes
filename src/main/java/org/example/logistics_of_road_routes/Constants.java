package org.example.logistics_of_road_routes;

public class Constants {
    //ошибки
    public static final String ROAD_NOT_FOUND = "Дорога не найдена";
    public static final String CAR_NOT_FOUND = "Мошина не найдена";
    public static final String POINT_NOT_FOUND = "Точка не найдена";

    // Наименования сущностей
    public static final String USER_ENTITY_NAME = "Пользователь";
    public static final String ROAD_ENTITY_NAME = "Дорога";
    public static final String CAR_ENTITY_NAME = "Машина";
    public static final String POINT_ENTITY_NAME = "Точка";
    public static final String POINT_OF_PRODUCTION_ENTITY_NAME = "Точка производства";
    public static final String POINT_OF_SALE_ENTITY_NAME = "Точка сбыта";

    //Стандартные тексты ответов
    public static final String SUCCESS_RESPONSE = "Операция выполнена успешно";
    public static final String FAILURE_RESPONSE = "Произошла ошибка. Пожалуйста, попробуйте еще раз";

    private Constants() {
        throw new UnsupportedOperationException("Этот класс не должен быть инстанцирован.");
    }
}