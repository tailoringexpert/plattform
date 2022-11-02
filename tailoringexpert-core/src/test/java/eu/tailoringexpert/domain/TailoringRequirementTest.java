/*-
 * #%L
 * TailoringExpert
 * %%
 * Copyright (C) 2022 Michael Bädorf and others
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */
package eu.tailoringexpert.domain;

import org.junit.jupiter.api.Test;

import static java.util.Collections.emptyList;
import static java.util.List.of;
import static org.assertj.core.api.Assertions.assertThat;

class TailoringRequirementTest {

    @Test
    void hasDRD_NullList_FalseReturned() {
        // arrange
        TailoringRequirement requirement = TailoringRequirement.builder()
            .drds(null)
            .build();

        // act
        boolean actual = requirement.hasDRD();

        // assert
        assertThat(actual).isFalse();
    }

    @Test
    void hasDRD_EmptyList_FalseReturned() {
        // arrange
        TailoringRequirement requirement = TailoringRequirement.builder()
            .drds(emptyList())
            .build();

        // act
        boolean actual = requirement.hasDRD();

        // assert
        assertThat(actual).isFalse();
    }

    @Test
    void hasDRD_ListWithEntry_TrueReturned() {
        // arrange
        TailoringRequirement requirement = TailoringRequirement.builder()
            .drds(of(
                DRD.builder().build()
            ))
            .build();

        // act
        boolean actual = requirement.hasDRD();

        // assert
        assertThat(actual).isTrue();
    }
}
