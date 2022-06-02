package com.boardgame.BoardGame.repository;

import com.boardgame.BoardGame.entity.file.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository <FileInfo, Long>{

}

