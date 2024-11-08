package com.ai.inthon.domains.ai.service;

import java.util.List;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.document.MetadataMode;
import org.springframework.ai.openai.OpenAiEmbeddingModel;
import org.springframework.ai.openai.OpenAiEmbeddingOptions;
import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.ai.retry.RetryUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OpenAIServiceImpl implements OpenAIService {

  @Value("${app.openai.api-key}")
  public String apiKey;

  public OpenAiApi openAiApi = new OpenAiApi(this.apiKey);

  public OpenAiEmbeddingModel model = new OpenAiEmbeddingModel(
    this.openAiApi,
    MetadataMode.ALL,
    OpenAiEmbeddingOptions
      .builder()
      .withModel("text-embedding-ada-002")
      .withUser("")
      .build(),
    RetryUtils.DEFAULT_RETRY_TEMPLATE
  );



}
