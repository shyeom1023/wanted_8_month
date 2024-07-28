CREATE TABLE user
(
    id         INT AUTO_INCREMENT,
    user_id    VARCHAR(50)                         NOT NULL,
    password   VARCHAR(255)                        NOT NULL,
    email      VARCHAR(50)                         NOT NULL,
    phone_no   VARCHAR(20)                         NOT NULL,
    deleted_at TIMESTAMP                           NULL,
    updated_id INT                                 NOT NULL,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    created_id INT                                 NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (id)
);

CREATE TABLE board
(
    id         INT AUTO_INCREMENT,
    user_id    INT                                 NOT NULL,
    title      VARCHAR(255)                        NULL,
    content    TEXT                                NOT NULL,
    deleted_at TIMESTAMP                           NULL,
    updated_id INT                                 NOT NULL,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    created_id INT                                 NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    PRIMARY KEY (id),
    INDEX idx_board_01 (user_id),
    INDEX idx_board_02 (updated_at),
    INDEX idx_board_03 (created_at)
);