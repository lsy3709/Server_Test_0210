package com.busanit501.server_test_0210._0209_todo.domain;

import java.time.LocalDate;

@Getter
@Builder
@ToString
@NoArgsConstructor // 기본 생성자를 생성함.
@AllArgsConstructor // 모든 멤버를 매개변수로 가지는 생성자를 생성함.
public class _0209_5_TodoVO {

    private Long tno;
    private String title;
    private LocalDate dueDate;
    private  boolean finished;

}