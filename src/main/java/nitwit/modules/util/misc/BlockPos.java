package nitwit.modules.util.misc;

import net.minecraft.client.Minecraft;

public class BlockPos {
    public int x, y, z;

    public BlockPos(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public boolean equals(Object o){
        if(o instanceof BlockPos){
            BlockPos pos = (BlockPos) o;
            return this.x == pos.x && this.y == pos.y && this.z == pos.z;
        }
        return false;
    }

    public BlockPos getBlockPos() {
        return this;
    }

    public int getId(){
        return Minecraft.getMinecraft().theWorld.getBlockId(x, y, z);
    }

    public int getMeta(){
        return Minecraft.getMinecraft().theWorld.getBlockMetadata(x, y, z);
    }

    public BlockPos up(){
        return new BlockPos(this.x, this.y + 1, this.z);
    }

    public BlockPos down(){
        return new BlockPos(this.x, this.y - 1, this.z);
    }

    public BlockPos north(){
        return new BlockPos(this.x, this.y, this.z - 1);
    }

    public BlockPos south(){
        return new BlockPos(this.x, this.y, this.z + 1);
    }

    public BlockPos east(){
        return new BlockPos(this.x + 1, this.y, this.z);
    }

    public BlockPos west(){
        return new BlockPos(this.x - 1, this.y, this.z);
    }

    public String toString(){
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
}
