package com.projeto.springbatalhanaval.controller;

import com.projeto.springbatalhanaval.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/players")
public class PlayerController {

    private final PlayerService playerService;
}
