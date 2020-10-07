class Animations{ //I wanted to do this all in a single file, without images "for kicks"
    //I had to "compile" these because this source was exceeding the maximum size for a java file
    public static final Animation IDLE_MATURE = new Animation(true,new AnimationFrame[]{new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0xfc00,0x10200,0x24900,0x20100,0x23100,0x20100,0x20100,0x10200,0xfc00,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0}),new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0xfc00,0x10200,0x28500,0x23100,0x23100,0x20100,0x10200,0xfc00,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0})});
    public static final Animation SLEEP_MATURE = new Animation(true,new AnimationFrame[]{new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x3fc00,0x40200,0x80100}),new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1f800,0x20400,0x40200,0x40200})});
    public static final Animation SLEEP_BABY = new Animation(true,new AnimationFrame[]{new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x78000,0xfc000,0x1fe000}),new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1fe000,0x3ff000})});
    public static final Animation IDLE_BABY = new Animation(true,new AnimationFrame[]{new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x78000,0xb4000,0x1fe000}),new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x78000,0xcc000,0x84000,0xb4000,0x84000,0x78000,0x0})});
    public static final Animation OVERLAY_ZZZ = new Animation(new AnimationFrame[]{new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0xf800000,0x4000000,0x2000000,0x1000000,0xf800000,0x0,0x0,0x3c00000,0x1000000,0x800000,0x3c00000,0x0,0x700000,0x200000,0x700000,0x0,0x80000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0}),new AnimationFrame(new int[]{0x0,0x0,0x0,0xf800000,0x4000000,0x2000000,0x1000000,0xf800000,0x0,0x0,0x3c00000,0x1000000,0x800000,0x3c00000,0x0,0x700000,0x200000,0x700000,0x0,0x80000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0})});
    public static final Animation IDLE_EGG = new Animation(true,new AnimationFrame[]{new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x7e000,0x87000,0x103800,0x300c00,0x700400,0x418200,0x418200,0x400200,0x700600,0x3c0c00,0x1e0800,0x3ffc00,0x0}),new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x7e000,0x87000,0x103800,0x300c00,0x700400,0x400200,0x418200,0x418200,0x700600,0x3c0c00,0xffff00,0x0})});
    public static final Animation OVERLAY_EAT = new Animation(new AnimationFrame[]{new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x4000000,0x2000000,0x7700000,0xff00000,0xfd00000,0xff00000,0x7f00000,0x7e00000,0x3c00000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0}),new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x4000000,0x2000000,0x7700000,0xfe00000,0xfc00000,0xfe00000,0x7f00000,0x7e00000,0x3c00000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0}),new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x4000000,0x2000000,0x7400000,0xf800000,0xf800000,0xf800000,0x7c00000,0x7e00000,0x3c00000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0}),new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x4000000,0x2000000,0x7000000,0xf000000,0xe000000,0xe000000,0x7000000,0x7800000,0x3c00000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0}),new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x4000000,0x2000000,0x1000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0}),new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0})});
    public static final Animation OVERLAY_STINK = new Animation(new AnimationFrame[]{new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x10000000,0x8000008,0x10000004,0xa000028,0x11000044,0xa000028,0x1000044,0x12000020,0x21000040,0x10000000,0x20000000,0x10000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0}),new AnimationFrame(new int[]{0x0,0x0,0x0,0x10000000,0x8000008,0x10000004,0xa000028,0x11000044,0xa000028,0x1000044,0x12000020,0x21000040,0x10000000,0x20000000,0x10000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0})});
    public static final Animation OVERLAY_DEAD = new Animation(new AnimationFrame[]{new AnimationFrame(new int[]{0x0,0x0,0xfc00000,0x1fe00000,0x1b600000,0x1fe00000,0xfc00000,0xfc00000,0x5400000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0}),new AnimationFrame(new int[]{0x0,0x0,0x7e00000,0xff00000,0xdb00000,0xff00000,0x7e00000,0x7e00000,0x2a00000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0})});
    public static final Animation OVERLAY_EXCLAIM = new Animation(new AnimationFrame[]{new AnimationFrame(new int[]{0x0,0x20,0x70,0x70,0x70,0x70,0x70,0x70,0x70,0x20,0x0,0x20,0x70,0x20,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0}),new AnimationFrame(new int[]{0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0})});
    public static final Animation OVERLAY_CLEAN = new Animation(new AnimationFrame[]{new AnimationFrame(new int[]{0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2,0x2})});
}