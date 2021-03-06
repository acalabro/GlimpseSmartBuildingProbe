 /*
  * GLIMPSE: A generic and flexible monitoring infrastructure.
  * For further information: http://labsewiki.isti.cnr.it/labse/tools/glimpse/public/main
  * 
  * Copyright (C) 2011  Software Engineering Laboratory - ISTI CNR - Pisa - Italy
  * 
  * This program is free software: you can redistribute it and/or modify
  * it under the terms of the GNU General Public License as published by
  * the Free Software Foundation, either version 3 of the License, or
  * (at your option) any later version.
  * 
  * This program is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  * 
  * You should have received a copy of the GNU General Public License
  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
  * 
*/
package it.cnr.isti.labsedc.glimpse.probe;

import it.cnr.isti.labsedc.glimpse.event.GlimpseBaseEvent;

/**
 * 
 * The interface {@link GlimpseProbeInterface} contains the event that a generic probe<br />
 * must implement to generate events.
 * 
 *  The behaviour of a Probe is defined in {@link GlimpseProbe}
 * 
 * @author acalabro
 *
 */
public interface GlimpseProbeInterface {

	public void sendMessage(GlimpseBaseEvent<?> event, boolean debug);
}
