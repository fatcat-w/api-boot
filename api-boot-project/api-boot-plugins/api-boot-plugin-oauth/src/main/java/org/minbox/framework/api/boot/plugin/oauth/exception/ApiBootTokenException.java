/*
 * Copyright [2019] [恒宇少年 - 于起宇]
 *
 *      Licensed under the Apache License, Version 2.0 (the "License");
 *      you may not use this file except in compliance with the License.
 *      You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing, software
 *      distributed under the License is distributed on an "AS IS" BASIS,
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *      See the License for the specific language governing permissions and
 *      limitations under the License.
 *
 */

package org.minbox.framework.api.boot.plugin.oauth.exception;

import lombok.Getter;
import org.springframework.security.core.AuthenticationException;

/**
 * ApiBoot Token Exception
 *
 * @author 恒宇少年
 */
@Getter
public class ApiBootTokenException extends AuthenticationException {
    public ApiBootTokenException(String msg) {
        super(msg);
    }

    public ApiBootTokenException(String msg, Throwable t) {
        super(msg, t);
    }
}
