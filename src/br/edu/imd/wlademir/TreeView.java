package br.edu.imd.wlademir;

import javax.swing.*;
import java.awt.*;

public class TreeView extends JComponent {
	
	// @ invariant nodeSize > 0;
	// @ invariant offset > 0;
    private /*@ spec_public nullable @*/ Tree arvore = null;
    private /*@ spec_public @*/ int nodeSize = 30;
    private /*@ spec_public @*/ int offset = 80;
    
    // @ assignable this.arvore;
    public TreeView(Tree arvore) {
        this.arvore = arvore;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        if (this.arvore == null) {
            return;
        }
        drawNode(
                graphics,
                this.arvore.getRoot(),
                getWidth() / 2,
                0,
                0 //nível
        );
    }

    /* @
     @ requires  (graphics != null) && (level >=0);
     @ ensures this.tree == \oldthis.tree;
     @*/
    private void drawNode(Graphics graphics, Node node, int x, int y, int level) {
        graphics.drawOval(x, y, nodeSize, nodeSize);
        graphics.drawString(
                String.valueOf(node.getValor()),
                x + 8,
                y + 20
        );

        if (node.getLeft() != null) {
            int childX;
            int childY;
            if (level == 0) {
                childX = 300;
                childY = y + offset;
            } else if (level == 1) {
                childX = x - offset * (level + 1);
                childY = y + offset * level;
            } else {
                childX = x - offset * (level + 1) / level;
                childY = y + offset * level;
            }
            graphics.drawLine(
                    x + nodeSize / 2,
                    y + nodeSize,
                    childX + nodeSize / 2,
                    childY
            );
            drawNode(graphics, node.getLeft(), childX, childY, level + 1);
        }

        if (node.getRight() != null) {
            int childX;
            int childY;
            if (level == 0) {
                childX = 1920 - 700;
                childY = y + offset;
            } else if (level == 1) {
                childX = x + offset * (level + 1);
                childY = y + offset * level;
            } else {
                childX = x + offset * (level + 1) / level;
                childY = y + offset * level;
            }
            graphics.drawLine(
                    x + nodeSize / 2,
                    y + nodeSize,
                    childX + nodeSize / 2,
                    childY
            );

            drawNode(graphics, node.getRight(), childX, childY, level + 1);
        }
    }
}
