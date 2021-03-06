/**
 * 	This file is part of Kayak.
 *
 *	Kayak is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU Lesser General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	Kayak is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *
 *	You should have received a copy of the GNU Lesser General Public License
 *	along with Kayak.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.github.andy2003.ui.descriptions;

import com.github.andy2003.core.description.BusDescription;
import com.github.andy2003.core.description.Document;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;

/**
 *
 * @author dschanoeh
 */
public class DocumentChildrenFactory extends ChildFactory<BusDescription> {

    private Document document;

    public DocumentChildrenFactory(Document document) {
        this.document = document;
    }

    @Override
    protected boolean createKeys(List<BusDescription> list) {
        list.addAll(document.getBusDescriptions());
        return true;
    }

    @Override
    protected Node[] createNodesForKey(BusDescription key) {
        return new Node[] { new DescriptionNode(key) };
    }


}
