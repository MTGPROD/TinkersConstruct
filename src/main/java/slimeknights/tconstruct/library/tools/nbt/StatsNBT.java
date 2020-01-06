package slimeknights.tconstruct.library.tools.nbt;

/**
 * All the stats that every tool must have.
 * Some may not be used explicitly by all tools (e.g. weapons and harvest  level)
 */
public class StatsNBT {

  public final static int DEFAULT_MODIFIERS = 3;

  public int durability;
  public int harvestLevel;
  public float attack;
  public float speed; // mining speed
  public float attackSpeedMultiplier;
  public int modifiers; // free modifiers

  public StatsNBT() {
    durability = 0;
    harvestLevel = 0;
    attack = 0;
    speed = 0;
    attackSpeedMultiplier = 1;
    modifiers = DEFAULT_MODIFIERS;
  }
//
//  public StatsNBT(NBTTagCompound tag) {
//    read(tag);
//    parent = tag;
//  }
//
//  /** Initialize the stats with the heads. CALL THIS FIRST */
//  public StatsNBT head(HeadMaterialStats... heads) {
//    durability = 0;
//    harvestLevel = 0;
//    attack = 0;
//    speed = 0;
//
//    // average all stats
//    for(HeadMaterialStats head : heads) {
//      if(head != null) {
//        durability += head.durability;
//        attack += head.attack;
//        speed += head.miningspeed;
//
//        // use highest harvestlevel
//        if(head.harvestLevel > harvestLevel) {
//          harvestLevel = head.harvestLevel;
//        }
//      }
//    }
//
//    durability = Math.max(1, durability / heads.length);
//    attack /= (float) heads.length;
//    speed /= (float) heads.length;
//
//    return this;
//  }
//
//  /** Add stats from the accessoires. Call this second! */
//  public StatsNBT extra(ExtraMaterialStats... extras) {
//    int dur = 0;
//    for(ExtraMaterialStats extra : extras) {
//      if(extra != null) {
//        dur += extra.extraDurability;
//      }
//    }
//    this.durability += Math.round((float) dur / (float) extras.length);
//
//    return this;
//  }
//
//  /** Calculate in handles. call this last! */
//  public StatsNBT handle(HandleMaterialStats... handles) {
//    // (Average Head Durability + Average Extra Durability) * Average Handle Modifier + Average Handle Durability
//
//    int dur = 0;
//    float modifier = 0f;
//    for(HandleMaterialStats handle : handles) {
//      if(handle != null) {
//        dur += handle.durability;
//        modifier += handle.modifier;
//      }
//    }
//
//    modifier /= (float) handles.length;
//    this.durability = Math.round((float) this.durability * modifier);
//
//    // add in handle durability change
//    this.durability += Math.round((float) dur / (float) handles.length);
//
//    this.durability = Math.max(1, this.durability);
//
//    return this;
//  }
//
//  public void read(NBTTagCompound tag) {
//    durability = tag.getInteger(Tags.DURABILITY);
//    harvestLevel = tag.getInteger(Tags.HARVESTLEVEL);
//    attack = tag.getFloat(Tags.ATTACK);
//    speed = tag.getFloat(Tags.MININGSPEED);
//    attackSpeedMultiplier = tag.getFloat(Tags.ATTACKSPEEDMULTIPLIER);
//    modifiers = tag.getInteger(Tags.FREE_MODIFIERS);
//  }
//
//  public void write(NBTTagCompound tag) {
//    tag.setInteger(Tags.DURABILITY, durability);
//    tag.setInteger(Tags.HARVESTLEVEL, harvestLevel);
//    tag.setFloat(Tags.ATTACK, attack);
//    tag.setFloat(Tags.MININGSPEED, speed);
//    tag.setFloat(Tags.ATTACKSPEEDMULTIPLIER, attackSpeedMultiplier);
//    tag.setInteger(Tags.FREE_MODIFIERS, modifiers);
//  }
//
//  public NBTTagCompound get() {
//    NBTTagCompound tag = parent.copy();
//    write(tag);
//
//    return tag;
//  }
//
//  // AUtogenerated equals and hashcode
//  @Override
//  public boolean equals(Object o) {
//    if(this == o) {
//      return true;
//    }
//    if(o == null || getClass() != o.getClass()) {
//      return false;
//    }
//
//    StatsNBT toolNBT = (StatsNBT) o;
//
//    if(durability != toolNBT.durability) {
//      return false;
//    }
//    if(harvestLevel != toolNBT.harvestLevel) {
//      return false;
//    }
//    if(Float.compare(toolNBT.attack, attack) != 0) {
//      return false;
//    }
//    if(Float.compare(toolNBT.speed, speed) != 0) {
//      return false;
//    }
//    return modifiers == toolNBT.modifiers;
//
//  }
//
//  @Override
//  public int hashCode() {
//    int result = durability;
//    result = 31 * result + harvestLevel;
//    result = 31 * result + (attack != +0.0f ? Float.floatToIntBits(attack) : 0);
//    result = 31 * result + (speed != +0.0f ? Float.floatToIntBits(speed) : 0);
//    result = 31 * result + modifiers;
//    return result;
//  }
}
