package com.capstone2024.scss.infrastructure.converters;

import com.capstone2024.scss.domain.account.enums.LoginMethod;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class LoginMethodConverter implements AttributeConverter<LoginMethod, String> {

    @Override
    public String convertToDatabaseColumn(LoginMethod attribute) {
        return attribute.name();
    }

    @Override
    public LoginMethod convertToEntityAttribute(String dbData) {
        return LoginMethod.valueOf(dbData);
    }
}
