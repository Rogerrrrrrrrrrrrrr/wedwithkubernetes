# Use the official WordPress image from Docker Hub
FROM wordpress:latest

# Set the working directory in the container
WORKDIR /var/www/html

# Copy the contents of the local wp-content directory to the container's wp-content directory
COPY wp-content /var/www/html/wp-content

# Expose port 80 to allow external access
EXPOSE 80

# Start the WordPress server
CMD ["apache2-foreground"]
