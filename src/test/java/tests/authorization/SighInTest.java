package tests.authorization;

import tests.base.BaseTest;

public class SighInTest extends BaseTest {

    //  Линк "Войти" в хедере MainPage > modal
    //  Линк "Войти" в хедере merchant productPage > modal
    //  Линк "Войти" в хедере domestic productPage > modal
    //  Линк "Войти" в хедере  contentPage > modal
    //  Линк "Войти" в хедере pricingPage > modal
    //  Линк "Войти" в хедере brandPage > modal
    //  Линк "Войти" в хедере catalogTOPage > modal
    //  Линк "Войти" в хедере cartPage > modal
    //  Линк "Войти" в хедере checkoutPage > modal
    //  Линк "Войти" в хедере loginPage > modal
    //  Линк "Войти" on center loginPage
    //  Линк "Войти" в хедере registerPage  > modal
    //  Линк "Войти" on registerPage (redirect to loginPage)

    //проверки поля Email:
    //email введен
    //email не введен
    //максимальное (max) кол-во символов
    //max+1
    //max-1
    //латинские символы
    //цифры
    //спецсимволы
    //пробелы в начале и в конце строки
    //пробелы в середине
    //доменное имя указано
    //доменное имя не указано
    //"@" введен
    //"@" не введен
    //более одного "@"

    //Проверка валидного адреса
    //Валидный email, содержащий строчный и заглавные буквы - валидный
    //Начинающийся с цифры в локальной части email - валидный
    //Начинающийся с цифры в доменной части email - валидный
    //Email c несколькими точками в локальной и доменной части - валидный
    //Email с дефисом в локальной части email - валидный
    //Email с дефисом в доменной части email - валидный
    //Email с нижним подчеркиванием в локальной части email - валидный
    //Email с нижним подчеркиванием в доменной части email - валидный
    //Длинный Email (локальная часть 64 символа, доменная часть 64 символа) - валидный

    //Проверка на невалидность
    //Пустое поле - невалидный
    //Превышение длины локальной части (максимальная допустимая 64 символа) - невалидный
    //Превышение длины доменного имени (максимальная допустимая 64 символов) - или 63?! - невалидный
    //Отсутствие @ в email - невалидный
    //Отсутствие локальной части - невалидный
    //Отсутствие доменной части - невалидный
    //Содержит две точки подряд - невалидный
    //Локальная часть начинается (или заканчивается) с . (точки) - невалидный
    //Доменная часть начинается (или заканчивается) с . (точки) - невалидный





}
