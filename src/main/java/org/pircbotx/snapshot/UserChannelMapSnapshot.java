/**
 * Copyright (C) 2010-2013 Leon Blakey <lord.quackstar at gmail.com>
 *
 * This file is part of PircBotX.
 *
 * PircBotX is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PircBotX is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with PircBotX. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pircbotx.snapshot;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import org.pircbotx.Channel;
import org.pircbotx.User;
import org.pircbotx.UserChannelMap;

/**
 *
 * @author Leon
 */
public class UserChannelMapSnapshot extends UserChannelMap<UserSnapshot, ChannelSnapshot> {
	public UserChannelMapSnapshot(Multimap<UserSnapshot, ChannelSnapshot> userToChannelSnapshot, Multimap<ChannelSnapshot, UserSnapshot> channelToUserSnapshot) {
		super(userToChannelSnapshot, channelToUserSnapshot);
	}

	@Override
	public void removeUserFromChannel(UserSnapshot user, ChannelSnapshot channel) {
		SnapshotUtils.fail();
	}

	@Override
	public void removeUser(UserSnapshot user) {
		SnapshotUtils.fail();
	}

	@Override
	public void removeChannel(ChannelSnapshot channel) {
		SnapshotUtils.fail();
	}

	@Override
	public void clear() {
		SnapshotUtils.fail();
	}
}