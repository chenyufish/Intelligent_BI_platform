package com.fishman.fishmanBI.api;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import com.fishman.fishmanBI.common.ErrorCode;
import com.fishman.fishmanBI.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 调用 AI 平台的示例代码
 */
@Service
public class OpenAiApi {

    public static void main(String[] args) {

        /**
//         * AI 对话（需要自己创建请求响应对象）
//         *
//         * @param request
//         * @param openAiApiKey
//         * @return
//         */
//        public CreateChatCompletionResponse createChatCompletion(CreateChatCompletionRequest request, String openAiApiKey) {
//            if (StringUtils.isBlank(openAiApiKey)) {
//                throw new BusinessException(ErrorCode.PARAMS_ERROR, "未传 openAiApiKey");
//            }
//            String url = "https://api.openai.com/v1/chat/completions";
//            String json = JSONUtil.toJsonStr(request);
//            String result = HttpRequest.post(url)
//                    .header("Authorization", "Bearer " + openAiApiKey)
//                    .body(json)
//                    .execute()
//                    .body();
//            return JSONUtil.toBean(result, CreateChatCompletionResponse.class);
//        }

    }
}
