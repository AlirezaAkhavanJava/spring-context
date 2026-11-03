package com.me;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SimpleComponent.class)
public class ImportConfig {}
