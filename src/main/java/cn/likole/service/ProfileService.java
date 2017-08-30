package cn.likole.service;

import cn.likole.dao.GroupDao;
import cn.likole.dao.InfoDao;
import cn.likole.dao.MemberDao;
import cn.likole.dto.MemberDto;
import cn.likole.entity.Groups;
import cn.likole.entity.Info;
import cn.likole.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by likole on 8/28/17.
 */
@Service
@Transactional
public class ProfileService {

    @Autowired
    GroupDao groupDao;
    @Autowired
    MemberDao memberDao;
    @Autowired
    InfoDao infoDao;

    public List<Groups> getGroupList() {
        return groupDao.getAll();
    }

    public Groups getGroup(int gid) {
        return groupDao.getByGid(gid);
    }

    public List<MemberDto> getMemberList(int gid) {
        List<Member> members = memberDao.getByGid(gid);
        List<MemberDto> memberDtos = new ArrayList<MemberDto>();

        for (Member member : members) {
            Info info = infoDao.getById(member.getSid());

            MemberDto memberDto = new MemberDto();
            memberDto.setName(info.getName());
            memberDto.setMajor(info.getZy());
            memberDto.setGrade(info.getBj());
            memberDto.setBoy(info.getGender() == 1);
            memberDto.setGroup(member.getGid());
            memberDto.setDescription(member.getDescription());
            memberDto.setPictures(member.getPictures());
            memberDto.setAvatar(member.getAvatar());
            memberDto.setQq(member.getQq());
            memberDto.setGithub(member.getGithub());
            memberDto.setEmail(member.getEmail());
            memberDto.setBirthday(info.getIdcard().substring(6,14));
            memberDto.setHomepage(member.getHomepage());

            memberDtos.add(memberDto);
        }

        return memberDtos;
    }

    public MemberDto getMember(int mid) {

        Member member= memberDao.getByMid(mid);
        if(member==null)return null;
        Info info = infoDao.getById(member.getSid());
        MemberDto memberDto = new MemberDto();
        memberDto.setName(info.getName());
        memberDto.setMajor(info.getZy());
        memberDto.setGrade(info.getBj());
        memberDto.setBoy(info.getGender() == 1);
        memberDto.setGroup(member.getGid());
        memberDto.setDescription(member.getDescription());
        memberDto.setPictures(member.getPictures());
        memberDto.setAvatar(member.getAvatar());
        memberDto.setQq(member.getQq());
        memberDto.setGithub(member.getGithub());
        memberDto.setEmail(member.getEmail());
        memberDto.setBirthday(info.getIdcard().substring(6,14));
        memberDto.setHomepage(member.getHomepage());

        return memberDto;
    }

}
