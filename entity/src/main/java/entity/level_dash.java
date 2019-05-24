package entity;


public class level_dash extends Entity {

    /** The id. */
    private int	level;

    /** The message. */
    private String	map;

    /**
     * Instantiates a new hello world.
     *
     * @param level
     *          the id

     * @param map
     *          the message
     */
    public level_dash(final int level, final String map) {
        this.setlevel(level);
        this.setmap(map);
    }

    /**
     * Instantiates a new level_dash.
     */
    public level_dash() {
        this(0	, "");
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getlevel() {
        return this.level;
    }

    /**
     * Sets the id.
     *
     * @param level
     *          the new id
     */
    public void setlevel(final int level) {
        this.level = level;
    }



    /**
     * Gets the map.
     *
     * @return the map
     */
    public String getmap() {
        return this.map;
    }

    /**
     * Sets the map
     *
     * @param map
     *          the new map
     */
    public void setmap(final String map) {
        this.map = map;
    }
