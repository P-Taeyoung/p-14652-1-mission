package com.back.standard.member.event;

import com.back.standard.event.HasEventName;
import com.back.standard.member.dto.MemberDto;

public record MemberJoinedEvent(
	MemberDto member
) implements HasEventName {
}
